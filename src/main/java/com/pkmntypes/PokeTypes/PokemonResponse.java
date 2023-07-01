package com.pkmntypes.PokeTypes;

import java.util.List;

public class PokemonResponse {
	private String name;
	private List<String> types;
	private List<String> abilities;
	private String spriteUrl;
	private PokemonWeaknesses weaknesses;
	
	public PokemonResponse() {}
	public PokemonResponse(String name, List<String> types, List<String> abilities, String spriteUrl, PokemonWeaknesses weaknesses) {
		super();
		this.name = name;
		this.types = types;
		this.abilities = abilities;
		this.spriteUrl = spriteUrl;
		this.weaknesses = weaknesses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	public List<String> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<String> abilities) {
		this.abilities = abilities;
	}
	public String getSpriteUrl() {
		return spriteUrl;
	}
	public void setSpriteUrl(String spriteUrl) {
		this.spriteUrl = spriteUrl;
	}
	public PokemonWeaknesses getWeaknesses() {
		return weaknesses;
	}
	public void setWeaknesses(PokemonWeaknesses weaknesses) {
		this.weaknesses = weaknesses;
	}
}
