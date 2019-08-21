package com.techelevator;

public class SecondClassMail extends PostalService implements DeliveryDriver{
	
	@Override
	public double calculateRate(int distance, double weight) {
		if (weight <= 0.125) {
			setPostageRate(0.0035);
		}
		else if (weight <= 0.5) {
			setPostageRate(0.0040);
		}
		else if(weight <= 0.9375) {
			setPostageRate(0.0047);
		}
		else if(weight <= 3) {
			setPostageRate(0.0195);
		}
		else if(weight <= 8) {
			setPostageRate(0.0450);
		}
		else {
			setPostageRate(0.0500);
		}
		
		return super.calculateRate(distance, weight);
	}
	
	@Override
	public String getName() {
		return "Postal Service (2nd Class)";
	}

}
