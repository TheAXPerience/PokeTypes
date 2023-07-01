package com.pkmntypes.PokeTypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"ability",
	"is_hidden",
	"slot"
})
public class PokemonAbility {
	record Ability(String name, String url) {}
	@JsonProperty("ability")
	private Ability ability;
	@JsonProperty("is_hidden")
	private boolean isHidden;
	
	public PokemonAbility() {}

	public PokemonAbility(Ability ability, boolean isHidden) {
		super();
		this.ability = ability;
		this.isHidden = isHidden;
	}

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
	
}
