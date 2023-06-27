package com.pkmntypes.PokeTypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"is_default",
	"pokemon"
})
public class PokemonVariety {
	@JsonProperty("is_default")
	private boolean isDefault;
	@JsonProperty("pokemon")
	private PokemonSpeciesPokemon pokemon;
	
	public PokemonVariety() {}
	
	public PokemonVariety(boolean isDefault, PokemonSpeciesPokemon pokemon) {
		super();
		this.isDefault = isDefault;
		this.pokemon = pokemon;
	}

	@JsonProperty("is_default")
	public boolean isIsDefault() {
		return isDefault;
	}
	@JsonProperty("is_default")
	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	@JsonProperty("pokemon")
	public PokemonSpeciesPokemon getPokemon() {
		return pokemon;
	}
	@JsonProperty("pokemon")
	public void setPokemon(PokemonSpeciesPokemon pokemon) {
		this.pokemon = pokemon;
	}
}
