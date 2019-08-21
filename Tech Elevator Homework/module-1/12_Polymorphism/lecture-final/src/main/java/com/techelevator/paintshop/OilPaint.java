package com.techelevator.paintshop;

public class OilPaint implements Paint  {

	private boolean interior;
	
	public OilPaint(boolean interior) {
		this.interior = interior;
	}
	
	@Override
	public String getName() {
		if (interior) {
			return "Interior Oil Paint";
		}
		return "External Oil Painter";
	}

	@Override
	public double calculateCost(int area) {
		int costPerBucket = 0;
		if (interior) {
			costPerBucket = 30;
		} else {
			costPerBucket = 50;
		}
		return (area / 600) * costPerBucket;
	}

}
