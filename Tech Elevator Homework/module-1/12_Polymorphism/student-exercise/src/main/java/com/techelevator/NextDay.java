package com.techelevator;

public class NextDay extends SPU implements DeliveryDriver {
	
	@Override
	public double calculateRate(int distance, double weight) {
			setPostageRate(0.075);
		return super.calculateRate(distance, weight);
	}
	
	@Override
	public String getName() {
		return "SPU (Next Day)";
	}
}
