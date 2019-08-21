package com.techelevator;

public class TwoDayBusiness extends SPU implements DeliveryDriver {
	
	@Override
	public double calculateRate(int distance, double weight) {
			setPostageRate(0.050);
		return super.calculateRate(distance, weight);
	}

	@Override
	public String getName() {
		return "SPU (2-Day Business)";
	}

}
