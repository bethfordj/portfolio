package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!");
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sleep() {
		kick();
	}

}