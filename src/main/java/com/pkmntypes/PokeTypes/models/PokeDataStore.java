package com.pkmntypes.PokeTypes.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.pkmntypes.PokeTypes.dataobjects.PokemonResponse;
import com.pkmntypes.PokeTypes.dataobjects.PokemonWeaknesses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PokeDataStore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @CreationTimestamp
  @Column(updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime dateCreated;
  
  @Column(columnDefinition="VARCHAR(32)") private String name;
  @Column private String type1;
  @Column private String type2;
  @Column private String ability1;
  @Column private String ability2;
  @Column private String ability3;
  @Column private String sprite;
  
  @Column private float normal;
  @Column private float fire;
  @Column private float water;
  @Column private float grass;
  @Column private float electric;
  @Column private float flying;
  @Column private float bug;
  @Column private float rock;
  @Column private float ground;
  @Column private float poison;
  @Column private float psychic;
  @Column private float ghost;
  @Column private float fighting;
  @Column private float ice;
  @Column private float dragon;
  @Column private float steel;
  @Column private float dark;
  @Column private float fairy;
  
  public PokeDataStore() {}
  
  public PokeDataStore(PokemonResponse response) {
    this.name = response.getName();
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
    
    PokemonWeaknesses weaknesses = response.getWeaknesses();
    this.bug = weaknesses.getBug();
    this.dark = weaknesses.getDark();
    this.dragon = weaknesses.getDragon();
    this.electric = weaknesses.getElectric();
    this.fairy = weaknesses.getFairy();
    this.fighting = weaknesses.getFighting();
    this.fire = weaknesses.getFire();
    this.flying = weaknesses.getFlying();
    this.ghost = weaknesses.getGhost();
    this.grass = weaknesses.getGrass();
    this.ground = weaknesses.getGround();
    this.ice = weaknesses.getIce();
    this.normal = weaknesses.getNormal();
    this.poison = weaknesses.getPoison();
    this.psychic = weaknesses.getPsychic();
    this.rock = weaknesses.getRock();
    this.steel = weaknesses.getSteel();
    this.water = weaknesses.getWater();
  }
  
  public PokemonResponse getResponse() {
    PokemonWeaknesses weaknesses = new PokemonWeaknesses();
    List<String> types = new ArrayList<String>();
    List<String> abilities = new ArrayList<String>();
    
    weaknesses.setBug(this.bug);
    weaknesses.setDark(this.dark);
    weaknesses.setDragon(this.dragon);
    weaknesses.setElectric(this.electric);
    weaknesses.setFairy(this.fairy);
    weaknesses.setFighting(this.fighting);
    weaknesses.setFire(this.fire);
    weaknesses.setFlying(this.flying);
    weaknesses.setGhost(this.ghost);
    weaknesses.setGrass(this.grass);
    weaknesses.setGround(this.ground);
    weaknesses.setIce(this.ice);
    weaknesses.setNormal(this.normal);
    weaknesses.setPoison(this.poison);
    weaknesses.setPsychic(this.psychic);
    weaknesses.setRock(this.rock);
    weaknesses.setSteel(this.steel);
    weaknesses.setWater(this.water);
    
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
  public float getNormal() {
    return normal;
  }
  public void setNormal(float normal) {
    this.normal = normal;
  }
  public float getFire() {
    return fire;
  }
  public void setFire(float fire) {
    this.fire = fire;
  }
  public float getWater() {
    return water;
  }
  public void setWater(float water) {
    this.water = water;
  }
  public float getGrass() {
    return grass;
  }
  public void setGrass(float grass) {
    this.grass = grass;
  }
  public float getElectric() {
    return electric;
  }
  public void setElectric(float electric) {
    this.electric = electric;
  }
  public float getFlying() {
    return flying;
  }
  public void setFlying(float flying) {
    this.flying = flying;
  }
  public float getBug() {
    return bug;
  }
  public void setBug(float bug) {
    this.bug = bug;
  }
  public float getRock() {
    return rock;
  }
  public void setRock(float rock) {
    this.rock = rock;
  }
  public float getGround() {
    return ground;
  }
  public void setGround(float ground) {
    this.ground = ground;
  }
  public float getPoison() {
    return poison;
  }
  public void setPoison(float poison) {
    this.poison = poison;
  }
  public float getPsychic() {
    return psychic;
  }
  public void setPsychic(float psychic) {
    this.psychic = psychic;
  }
  public float getGhost() {
    return ghost;
  }
  public void setGhost(float ghost) {
    this.ghost = ghost;
  }
  public float getFighting() {
    return fighting;
  }
  public void setFighting(float fighting) {
    this.fighting = fighting;
  }
  public float getIce() {
    return ice;
  }
  public void setIce(float ice) {
    this.ice = ice;
  }
  public float getDragon() {
    return dragon;
  }
  public void setDragon(float dragon) {
    this.dragon = dragon;
  }
  public float getSteel() {
    return steel;
  }
  public void setSteel(float steel) {
    this.steel = steel;
  }
  public float getDark() {
    return dark;
  }
  public void setDark(float dark) {
    this.dark = dark;
  }
  public float getFairy() {
    return fairy;
  }
  public void setFairy(float fairy) {
    this.fairy = fairy;
  }
}
