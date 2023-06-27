package com.pkmntypes.PokeTypes;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokeTypesController {
	PokeAPIScraper pokeAPIScraper;
	
	public PokeTypesController(PokeAPIScraper pokeAPIScraper) {
		this.pokeAPIScraper = pokeAPIScraper;
	}
	
	private String parsePokemonName(String pokemonName) {
		return pokemonName.toLowerCase().replace(' ', '-');
	}
	
	@ResponseBody
	@GetMapping("/{pokename}")
	public PokemonSpecies getPokemonByName(@PathVariable("pokename") String pokemonName) {
		try {
			PokemonSpecies ps = pokeAPIScraper.getPokemon(parsePokemonName(pokemonName));
			return ps;
		} catch (Exception e) {
			return new PokemonSpecies();
		}
	}
	
	@ResponseBody
	@GetMapping("/{pokename}/types")
	public List<PokemonForm> getPokemonTypes(@PathVariable("pokename") String pokemonName) {
		try {
			List<PokemonForm> forms = new ArrayList<PokemonForm>();
			PokemonSpecies ps = pokeAPIScraper.getPokemon(parsePokemonName(pokemonName));
			for (PokemonVariety pv : ps.getVarieties()) {
				forms.add(
						pokeAPIScraper.getPokemonForm(
								pv.getPokemon().getUrl()
						)
				);
			}
			return forms;
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<PokemonForm>();
		}
	}
}
