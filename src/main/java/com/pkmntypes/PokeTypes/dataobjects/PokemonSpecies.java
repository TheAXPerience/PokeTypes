package com.pkmntypes.PokeTypes.dataobjects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"base_happiness",
"capture_rate",
"color",
"egg_groups",
"evolution_chain",
"evolves_from_species",
"flavor_text_entries",
"form_descriptions",
"forms_switchable",
"gender_rate",
"genera",
"generation",
"growth_rate",
"habitat",
"has_gender_differences",
"hatch_counter",
"id",
"is_baby",
"is_legendary",
"is_mythical",
"name",
"names",
"order",
"pal_park_encounters",
"pokedex_numbers",
"shape",
"varieties"
})
public class PokemonSpecies {
	@JsonProperty("varieties")
	private List<PokemonVariety> varieties;
	
	public PokemonSpecies() {}
	
	@JsonProperty("varieties")
	public List<PokemonVariety> getVarieties() {
		return varieties;
	}
	@JsonProperty("varieties")
	public void setVarieties(List<PokemonVariety> varieties) {
		this.varieties = varieties;
	}
	
}
