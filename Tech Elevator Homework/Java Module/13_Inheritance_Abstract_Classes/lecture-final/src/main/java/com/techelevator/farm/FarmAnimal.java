package com.techelevator.farm;

public abstract class FarmAnimal {
	private String name;
	private boolean sleeping;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {
		if (sleeping) {
			return "Zzzzzz....";
		}
		return sound;
	}

	public void sleep() {
		sleeping = true;
	}

	public abstract String eat();

	protected String kick() {
		return "BOOM!!!";
	}
}