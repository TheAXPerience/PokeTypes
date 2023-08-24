package com.pkmntypes.PokeTypes;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pkmntypes.PokeTypes.dataobjects.PokemonForm;
import com.pkmntypes.PokeTypes.dataobjects.PokemonSpecies;

import reactor.core.publisher.Mono;

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
				.exchangeToMono(response -> {
					if (response.statusCode().equals(HttpStatus.NOT_FOUND)) {
						// if not found, return empty Mono
						return Mono.empty();
					} else {
						return response.bodyToMono(PokemonSpecies.class);
					}
				})
				.block();
	}
	
	public Mono<PokemonForm> getPokemonForm(String uri) {
		return this.webclient
				.get()
				.uri(uriBuilder -> uriBuilder
						.path("/{uri}")
						.build(parseVarietyURL(uri)))
				.exchangeToMono(response -> {
					if (response.statusCode().equals(HttpStatus.NOT_FOUND)) {
						// if not found, return empty Mono
						return Mono.empty();
					} else {
						return response.bodyToMono(PokemonForm.class);
					}
				});
	}
}
