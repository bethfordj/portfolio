package com.techelevator;

import java.util.Scanner;

public class EarthToSunWeightConverter {

	/*
	 * Command line programs usually follow this work flow:   Take Data, Calculate Data, Give Results
	 * 
	 * How can we do each of these steps?
	 */
	public static void main(String[] args) {
		
		int sunGravity = 28;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Earth weight:");
		String userInput = in.nextLine();
		
		int weightOnEarth = Integer.parseInt(userInput);
		
		int weightOnTheSun = weightOnEarth * sunGravity;
		
		System.out.printf("\n%-15s  %-15s", "Earth (lbs)", "Sun (lbs)");
		System.out.println("\n___________________________\n");
		System.out.printf("%-15s  %-15s", weightOnEarth, weightOnTheSun);


	}

}
