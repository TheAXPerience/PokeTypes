package com.pkmntypes.PokeTypes;

import java.util.List;

public class PokemonResponse {
	private String name;
	private List<String> types;
	private String spriteUrl;
	private PokemonWeaknesses weaknesses;
	
	public PokemonResponse() {}
	public PokemonResponse(String name, List<String> types, String spriteUrl, PokemonWeaknesses weaknesses) {
		super();
		this.name = name;
		this.types = types;
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
