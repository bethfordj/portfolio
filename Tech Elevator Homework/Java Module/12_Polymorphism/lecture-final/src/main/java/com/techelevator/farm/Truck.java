package com.techelevator.farm;

public class Truck implements Singable, Sellable {

	@Override
	public int getPrice() {
		return 500;
	}

	@Override
	public String getName() {
		return "Truck";
	}

	@Override
	public String getSound() {
		return "cough!";
	}

}
