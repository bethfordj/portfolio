package com.techelevator;

public class FirstClassMail extends PostalService implements DeliveryDriver{
	
	@Override
	public double calculateRate(int distance, double weight) {
		if (weight <= 0.125) {
			setPostageRate(0.035);
		}
		else if (weight <= 0.5) {
			setPostageRate(0.040);
		}
		else if(weight <= 0.9375) {
			setPostageRate(0.047);
		}
		else if(weight <= 3) {
			setPostageRate(0.195);
		}
		else if(weight <= 8) {
			setPostageRate(0.450);
		}
		else {
			setPostageRate(0.500);
		}
		
		return super.calculateRate(distance, weight);
	}
	
	
	@Override
	public String getName() {
		return "Postal Service (1st Class)";
	}

}
