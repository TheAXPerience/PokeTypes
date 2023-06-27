package com.pkmntypes.PokeTypes;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PokeAPIScraper {
	WebClient webclient;
	
	public PokeAPIScraper(WebClient webclient) {
		this.webclient = webclient;
	}
	
	private String parseVarietyURL(String url) {
		return url.substring(26);
	}
	
	public PokemonSpecies getPokemon(String uri) {
		return this.webclient
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/pokemon-species/{pokename}")
						.build(uri))
				.retrieve()
				.bodyToMono(PokemonSpecies.class)
				.block();
	}
	
	public PokemonForm getPokemonForm(String uri) {
		return this.webclient
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/{uri}")
						.build(parseVarietyURL(uri)))
				.retrieve()
				.bodyToMono(PokemonForm.class)
				.block();
	}
}
