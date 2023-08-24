package com.pkmntypes.PokeTypes.dataobjects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"slot",
	"type"
})
public class PokemonMasterType {
	@JsonProperty("type")
	private PokemonType type;
	
	public PokemonMasterType() {}
	public PokemonMasterType(PokemonType type) {
		super();
		this.type = type;
	}
	@JsonProperty("type")
	public PokemonType getType() {
		return type;
	}
	@JsonProperty("type")
	public void setType(PokemonType type) {
		this.type = type;
	}
}
