package com.techelevator.farm.something;

import com.techelevator.farm.FarmAnimal;

public class WeirdAnimal extends FarmAnimal {

	public WeirdAnimal(String name, String sound) {
		super(name, sound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String eat() {
		kick();
		return null;
	}

}
