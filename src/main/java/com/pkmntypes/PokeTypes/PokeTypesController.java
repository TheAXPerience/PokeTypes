package com.pkmntypes.PokeTypes;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PokeTypesController {
	PokeAPIScraper pokeAPIScraper;
	
	public PokeTypesController(PokeAPIScraper pokeAPIScraper) {
		this.pokeAPIScraper = pokeAPIScraper;
	}
	
	private String parsePokemonName(String pokemonName) {
		return pokemonName.toLowerCase().replace(' ', '-');
	}
	
	private Mono<PokemonResponse> createPokemonResponse(PokemonForm form) {
		if (form.getSprites().getFrontSprite() == null) {
			return Mono.empty();
		}
		
		PokemonWeaknesses weaknesses = new PokemonWeaknesses();
		List<String> types = new ArrayList<String>();
		
		for (PokemonMasterType type : form.getTypes()) {
			String t = type.getType().getName();
			types.add(t);
			weaknesses.addType(t);
		}
		
		return Mono.just(new PokemonResponse(
				form.getName(),
				types,
				form.getSprites().getFrontSprite(),
				weaknesses
		));
	}
	
	@GetMapping("/{pokename}")
	public ResponseEntity<List<PokemonResponse>> getPokemonTypes(@PathVariable("pokename") String pokemonName) {
		try {
			// get species
			PokemonSpecies ps = pokeAPIScraper.getPokemon(parsePokemonName(pokemonName));
			if (ps == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			// get forms
			List<String> formUrls = new ArrayList<String>();
			for (PokemonVariety pv : ps.getVarieties()) {
				formUrls.add(pv.getPokemon().getUrl());
			}
			// use Flux to asynchronously retrieve forms from their URLs
			// then map them into Response objects
			List<PokemonResponse> response = Flux.fromIterable(formUrls)
				.flatMap(url -> pokeAPIScraper.getPokemonForm(url))
				.flatMap(form -> createPokemonResponse(form))
				.collectList()
				.block();
			
			// return the list of forms as responses
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			// e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}