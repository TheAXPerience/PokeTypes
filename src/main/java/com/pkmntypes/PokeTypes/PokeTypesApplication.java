package com.pkmntypes.PokeTypes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class PokeTypesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeTypesApplication.class, args);
	}
	
	@Bean
	public WebClient webclient() {
		return WebClient
				.builder()
				.baseUrl("https://pokeapi.co/api/v2/")
				.codecs(codecs -> codecs
						.defaultCodecs()
						.maxInMemorySize(500 * 1024))
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.defaultCookie("key", "value")
				.build();
	}

}
