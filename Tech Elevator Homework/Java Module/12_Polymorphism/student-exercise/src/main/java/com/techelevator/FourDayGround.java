package com.techelevator;

public class FourDayGround extends SPU implements DeliveryDriver {
	
	@Override
	public double calculateRate(int distance, double weight) {
			setPostageRate(0.0050);
		return super.calculateRate(distance, weight);
	}

	@Override
	public String getName() {
		return "SPU (4-Day Ground)";
	}
}
