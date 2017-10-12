package com.zorro;

public class Avengers {

	private String name;

	private String breed;

	private String heroes[];

	private String tip = "This domain object provided by ContentNegotiatingViewResolver";
	
	public Avengers(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
		
	}

	public String getName() {
		return name;
	}

	public Avengers(String[] heroes) {
		super();
		this.heroes = heroes;
	}

	public String[] getHeroes() {
		return heroes;
	}

	public void setHeroes(String[] heroes) {
		this.heroes = heroes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
}
