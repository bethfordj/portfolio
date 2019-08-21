package com.techelevator;

public class Car implements Vehicle{
	
	private boolean hasTrailer;

	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;		
	}

	@Override
	public double calculateToll(int distance) {
		
		if (hasTrailer) {
			return distance * 0.020 + 1.00;
		}
		return distance * 0.020;
	}
	
	public String getName() {
		if (hasTrailer) {
			return "Car (with trailer)";
		}
		return "Car";
	}
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}
}
