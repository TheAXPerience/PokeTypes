package com.pkmntypes.PokeTypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"back_default",
	"back_female",
	"back_shiny",
	"back_shiny_female",
	"front_default",
	"front_female",
	"front_shiny_default",
	"front_shiny_female",
	"other",
	"versions"
})
public class PokemonSprites {
	@JsonProperty("front_default")
	private String frontSprite;

	public PokemonSprites() {}
	public PokemonSprites(String frontSprite) {
		super();
		this.frontSprite = frontSprite;
	}
	public String getFrontSprite() {
		return frontSprite;
	}
	public void setFrontSprite(String frontSprite) {
		this.frontSprite = frontSprite;
	}
}
