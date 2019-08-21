package com.techelevator;

public class Truck implements Vehicle{
	
	private int numberOfAxles;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	@Override
	public double calculateToll(int distance) {
		if (numberOfAxles == 4) {
			return distance * 0.040;
		}
		else if (numberOfAxles == 6) {
			return distance * 0.045;
		}
		else {
			return distance * 0.048;
		}
	}
	
	public String getName() {
		return "Truck";
	}
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
}
