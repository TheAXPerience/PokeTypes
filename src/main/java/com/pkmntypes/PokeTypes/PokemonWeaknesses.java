package com.pkmntypes.PokeTypes;

public class PokemonWeaknesses {
	private float normal;
	private float fire;
	private float water;
	private float grass;
	private float electric;
	private float flying;
	private float bug;
	private float rock;
	private float ground;
	private float poison;
	private float psychic;
	private float ghost;
	private float fighting;
	private float ice;
	private float dragon;
	private float steel;
	private float dark;
	private float fairy;
	
	public PokemonWeaknesses() {
		super();
		this.normal = 1.0f;
		this.fire = 1.0f;
		this.water = 1.0f;
		this.grass = 1.0f;
		this.electric = 1.0f;
		this.flying = 1.0f;
		this.bug = 1.0f;
		this.rock = 1.0f;
		this.ground = 1.0f;
		this.poison = 1.0f;
		this.psychic = 1.0f;
		this.ghost = 1.0f;
		this.fighting = 1.0f;
		this.ice = 1.0f;
		this.dragon = 1.0f;
		this.steel = 1.0f;
		this.dark = 1.0f;
		this.fairy = 1.0f;
	}
	
	public PokemonWeaknesses(float normal, float fire, float water, float grass, float electric, float flying,
			float bug, float rock, float ground, float poison, float psychic, float ghost, float fighting, float ice,
			float dragon, float steel, float dark, float fairy) {
		super();
		this.normal = normal;
		this.fire = fire;
		this.water = water;
		this.grass = grass;
		this.electric = electric;
		this.flying = flying;
		this.bug = bug;
		this.rock = rock;
		this.ground = ground;
		this.poison = poison;
		this.psychic = psychic;
		this.ghost = ghost;
		this.fighting = fighting;
		this.ice = ice;
		this.dragon = dragon;
		this.steel = steel;
		this.dark = dark;
		this.fairy = fairy;
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
	
	public void addType(String type) {
		if (type.equalsIgnoreCase("normal")) {
			this.fighting *= 2.0f;
			this.ghost *= 0.0f;
		} else if (type.equalsIgnoreCase("fire")) {
			this.water *= 2.0f;
			this.rock *= 2.0f;
			this.ground *= 2.0f;
			
			this.fire *= 0.5f;
			this.grass *= 0.5f;
			this.bug *= 0.5f;
			this.ice *= 0.5f;
			this.steel *= 0.5f;
			this.fairy *= 0.5f;
		} else if (type.equalsIgnoreCase("water")) {
			this.grass *= 2.0f;
			this.electric *= 2.0f;
			
			this.fire *= 0.5f;
			this.water *= 0.5f;
			this.ice *= 0.5f;
			this.steel *= 0.5f;
		} else if (type.equalsIgnoreCase("grass")) {
			this.fire *= 2.0f;
			this.ice *= 2.0f;
			this.poison *= 2.0f;
			this.flying *= 2.0f;
			this.bug *= 2.0f;
			
			this.water *= 0.5f;
			this.electric *= 0.5f;
			this.grass *= 0.5f;
			this.ground *= 0.5f;
		} else if (type.equalsIgnoreCase("electric")) {
			this.ground *= 2.0f;
			
			this.electric *= 0.5f;
			this.flying *= 0.5f;
			this.steel *= 0.5f;
		} else if (type.equalsIgnoreCase("flying")) {
			this.electric *= 2.0f;
			this.ice *= 2.0f;
			this.rock *= 2.0f;
			
			this.grass *= 0.5f;
			this.fighting *= 0.5f;
			this.bug *= 0.5f;
			
			this.ground *= 0.0f;
		} else if (type.equalsIgnoreCase("bug")) {
			this.fire *= 2.0f;
			this.flying *= 2.0f;
			this.rock *= 2.0f;
			
			this.grass *= 0.5f;
			this.fighting *= 0.5f;
			this.ground *= 0.5f;
		} else if (type.equalsIgnoreCase("rock")) {
			this.water *= 2.0f;
			this.grass *= 2.0f;
			this.fighting *= 2.0f;
			this.ground *= 2.0f;
			this.steel *= 2.0f;
			
			this.normal *= 0.5f;
			this.fire *= 0.5f;
			this.poison *= 0.5f;
			this.flying *= 0.5f;
		} else if (type.equalsIgnoreCase("ground")) {
			this.water *= 2.0f;
			this.grass *= 2.0f;
			this.ice *= 2.0f;
			
			this.poison *= 0.5f;
			this.rock *= 0.5f;
			
			this.electric *= 0.0f;
		} else if (type.equalsIgnoreCase("poison")) {
			this.ground *= 2.0f;
			this.psychic *= 2.0f;
			
			this.grass *= 0.5f;
			this.fighting *= 0.5f;
			this.poison *= 0.5f;
			this.bug *= 0.5f;
			this.fairy *= 0.5f;
		} else if (type.equalsIgnoreCase("psychic")) {
			this.bug *= 2.0f;
			this.ghost *= 2.0f;
			this.dark *= 2.0f;
			
			this.fighting *= 0.5f;
			this.psychic *= 0.5f;
		} else if (type.equalsIgnoreCase("ghost")) {
			this.ghost *= 2.0f;
			this.dark *= 2.0f;
			
			this.poison *= 0.5f;
			this.bug *= 0.5f;
			
			this.normal *= 0.0f;
			this.fighting *= 0.0f;
		} else if (type.equalsIgnoreCase("fighting")) {
			this.flying *= 2.0f;
			this.psychic *= 2.0f;
			this.fairy *= 2.0f;
			
			this.bug *= 0.5f;
			this.rock *= 0.5f;
			this.dark *= 0.5f;
		} else if (type.equalsIgnoreCase("ice")) {
			this.fire *= 2.0f;
			this.fighting *= 2.0f;
			this.rock *= 2.0f;
			this.steel *= 2.0f;
			
			this.ice *= 0.5f;
		} else if (type.equalsIgnoreCase("dragon")) {
			this.ice *= 2.0f;
			this.dragon *= 2.0f;
			this.fairy *= 2.0f;
			
			this.fire *= 0.5f;
			this.water *= 0.5f;
			this.grass *= 0.5f;
			this.electric *= 0.5f;
		} else if (type.equalsIgnoreCase("steel")) {
			this.fire *= 2.0f;
			this.fighting *= 2.0f;
			this.ground *= 2.0f;
			
			this.normal *= 0.5f;
			this.grass *= 0.5f;
			this.ice *= 0.5f;
			this.flying *= 0.5f;
			this.psychic *= 0.5f;
			this.bug *= 0.5f;
			this.rock *= 0.5f;
			this.dragon *= 0.5f;
			this.steel *= 0.5f;
			this.fairy *= 0.5f;
			
			this.poison *= 0.0f;
		} else if (type.equalsIgnoreCase("dark")) {
			this.bug *= 2.0f;
			this.fighting *= 2.0f;
			this.fairy *= 2.0f;
			
			this.ghost *= 0.5f;
			this.dark *= 0.5f;
			
			this.psychic *= 0.0f;
		} else if (type.equalsIgnoreCase("fairy")) {
			this.poison *= 2.0f;
			this.steel *= 2.0f;
			
			this.fighting *= 0.5f;
			this.bug *= 0.5f;
			this.dark *= 0.5f;
			
			this.dragon *= 0.0f;
		}
	}
}
