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
	@JsonProperty("abilities")
	List<PokemonAbility> abilities;
	@JsonProperty("name")
	private String name;
	@JsonProperty("sprites")
	private PokemonSprites sprites;
	@JsonProperty("types")
	private List<PokemonMasterType> types;
	
	public PokemonForm() {}

	public PokemonForm(List<PokemonAbility> abilities, String name, PokemonSprites sprites, List<PokemonMasterType> types) {
		super();
		this.abilities = abilities;
		this.name = name;
		this.sprites = sprites;
		this.types = types;
	}
	@JsonProperty("abilities")
	public List<PokemonAbility> getAbilities() {
		return abilities;
	}
	@JsonProperty("abilities")
	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("sprites")
	public PokemonSprites getSprites() {
		return sprites;
	}
	@JsonProperty("sprites")
	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
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
