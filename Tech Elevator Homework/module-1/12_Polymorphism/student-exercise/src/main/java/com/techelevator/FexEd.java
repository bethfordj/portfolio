package com.techelevator;

public class FexEd implements DeliveryDriver{
	
	private int distance;
	private double weight;    // weight is in pounds
	private double postageRate = 20.00;
	
	public double calculateRate(int distance, double weight) {
		if (distance > 500) {
			postageRate += 5.00;
		}
		if (weight > 3) {
			postageRate += 3.00;
		}
		return postageRate;
	}
	
	@Override
	public String getName() {
		return "FexEd";
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPostageRate() {
		return postageRate;
	}	
}
