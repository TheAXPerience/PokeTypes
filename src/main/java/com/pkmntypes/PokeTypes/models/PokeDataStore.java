package com.pkmntypes.PokeTypes.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLInsert;

import com.pkmntypes.PokeTypes.dataobjects.PokemonResponse;
import com.pkmntypes.PokeTypes.dataobjects.PokemonWeaknesses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "pokemon")
@SQLInsert(sql = "INSERT IGNORE INTO pokemon(ability1, ability2, ability3, date_created, name, species, sprite, type1, type2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
public class PokeDataStore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @CreationTimestamp
  @Column(updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime dateCreated;
  
  @Column(columnDefinition="VARCHAR(32)", unique=true) private String name;
  @Column(columnDefinition="VARCHAR(32)") private String species;
  @Column private String type1;
  @Column private String type2;
  @Column private String ability1;
  @Column private String ability2;
  @Column private String ability3;
  @Column private String sprite;
  
  public PokeDataStore() {}
  
  public PokeDataStore(PokemonResponse response, String species) {
    this.name = response.getName();
    this.species = species;
    List<String> types = response.getTypes();
    if (types.size() >= 1) {
      this.type1 = types.get(0);
    }
    if (types.size() >= 2) {
      this.type2 = types.get(1);
    }
    
    List<String> abilities = response.getAbilities();
    if (abilities.size() >= 1) {
      this.ability1 = abilities.get(0);
    }
    if (abilities.size() >= 2) {
      this.ability2 = abilities.get(1);
    }
    if (abilities.size() >= 3) {
      this.ability3 = abilities.get(2);
    }
    
    this.sprite = response.getSpriteUrl();
  }
  
  public PokemonResponse getResponse() {
    PokemonWeaknesses weaknesses = new PokemonWeaknesses();
    List<String> types = new ArrayList<String>();
    List<String> abilities = new ArrayList<String>();
    
    if (this.type1 != null) {
      types.add(this.type1);
      weaknesses.addType(type1);
    }
    if (this.type2 != null) {
      types.add(this.type2);
      weaknesses.addType(type2);
    }
    if (this.ability1 != null) { 
      abilities.add(this.ability1);
    }
    if (this.ability2 != null) { 
      abilities.add(this.ability2);
    }
    if (this.ability3 != null) { 
      abilities.add(this.ability3);
    }
    
    return new PokemonResponse(this.name, types, abilities, this.sprite, weaknesses);
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public LocalDateTime getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(LocalDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getType1() {
    return type1;
  }
  public void setType1(String type1) {
    this.type1 = type1;
  }
  public String getType2() {
    return type2;
  }
  public void setType2(String type2) {
    this.type2 = type2;
  }
  public String getAbility1() {
    return ability1;
  }
  public void setAbility1(String ability1) {
    this.ability1 = ability1;
  }
  public String getAbility2() {
    return ability2;
  }
  public void setAbility2(String ability2) {
    this.ability2 = ability2;
  }
  public String getAbility3() {
    return ability3;
  }
  public void setAbility3(String ability3) {
    this.ability3 = ability3;
  }
  public String getSprite() {
    return sprite;
  }
  public void setSprite(String sprite) {
    this.sprite = sprite;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }
  
}
