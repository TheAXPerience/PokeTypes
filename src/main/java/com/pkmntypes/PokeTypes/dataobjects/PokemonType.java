package com.pkmntypes.PokeTypes.dataobjects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"name",
	"url"
})
public class PokemonType {
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private String url;
	
	public PokemonType() {}

	public PokemonType(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}
	
}
