package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {
		
		List<Vehicle> vehiclesThroughToll = new ArrayList<Vehicle>();
		vehiclesThroughToll.add(new Car(true));
		vehiclesThroughToll.add(new Car(false));
		vehiclesThroughToll.add(new Truck(4));
		vehiclesThroughToll.add(new Truck(6));
		vehiclesThroughToll.add(new Truck(8));
		vehiclesThroughToll.add(new Tank());
		
		int totalMilesTraveled = 0;
		double totalTollRevenue = 0;
		
		System.out.printf("\n%-20s %-20s %-20s\n", "Vehicle", "Distance Traveled", "Toll $");
		System.out.println("-------------------------------------------------");
		
		for(Vehicle placeholderVehicle : vehiclesThroughToll) {
			double randomNumberCreation = (Math.random() * ((240 - 10) + 1)) + 10;
			int randomNumber = (int)randomNumberCreation;
			totalMilesTraveled += randomNumber;
			double toll = placeholderVehicle.calculateToll(randomNumber);
			totalTollRevenue += toll;
			BigDecimal roundedToll = new BigDecimal(toll);
			roundedToll = roundedToll.setScale(2, RoundingMode.HALF_UP);
			System.out.printf("\n%-20s %-20d %-20s", placeholderVehicle.getName(), randomNumber, "$" + roundedToll);
		}
		BigDecimal roundedTollRevenue = new BigDecimal(totalTollRevenue);
		roundedTollRevenue = roundedTollRevenue.setScale(2, RoundingMode.HALF_UP);
		System.out.println();
		System.out.println("Total Miles Traveled: " + totalMilesTraveled);
		System.out.println("Total Tollbooth Revenue: " + roundedTollRevenue);

	}

}
