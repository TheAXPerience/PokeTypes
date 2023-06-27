package com.pkmntypes.PokeTypes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"abilities",
	"base_experience",
	"forms",
	"game_indices",
	"height",
	"held_items",
	"id",
	"is_default",
	"location_area_encounters",
	"moves",
	"name",
	"order",
	"past_types",
	"species",
	"sprites",
	"stats",
	"types",
	"weight"
})
// The base of /pokemon/{id}
public class PokemonForm {
	@JsonProperty("name")
	private String name;
	@JsonProperty("types")
	private List<PokemonMasterType> types;
	
	public PokemonForm() {}

	public PokemonForm(String name, List<PokemonMasterType> types) {
		super();
		this.name = name;
		this.types = types;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("types")
	public List<PokemonMasterType> getTypes() {
		return types;
	}
	@JsonProperty("types")
	public void setTypes(List<PokemonMasterType> types) {
		this.types = types;
	}
	
}
