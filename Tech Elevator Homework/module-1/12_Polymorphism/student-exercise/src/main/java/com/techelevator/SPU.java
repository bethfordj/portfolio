package com.techelevator;

public abstract class SPU implements DeliveryDriver {
	
	private int distance;
	private double weight;    // weight is in pounds
	private double postageRate;
	
	public double calculateRate(int distance, double weight) {
		return distance * postageRate * weight;
	}
	
	@Override
	public String getName() {
		return "SPU";
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

	public void setPostageRate(double postageRate) {
		this.postageRate = postageRate;
	}

}
