package com.techelevator;

public class ThirdClassMail extends PostalService implements DeliveryDriver {
	
	@Override
	public double calculateRate(int distance, double weight) {
		if (weight <= 0.125) {
			setPostageRate(0.0020);
		}
		else if (weight <= 0.5) {
			setPostageRate(0.0022);
		}
		else if(weight <= 0.9375) {
			setPostageRate(0.0024);
		}
		else if(weight <= 3) {
			setPostageRate(0.0150);
		}
		else if(weight <= 8) {
			setPostageRate(0.0160);
		}
		else {
			setPostageRate(0.0170);
		}
		
		return super.calculateRate(distance, weight);
	}
	
	@Override
	public String getName() {
		return "Postal Service (3rd Class)";
	}

}
