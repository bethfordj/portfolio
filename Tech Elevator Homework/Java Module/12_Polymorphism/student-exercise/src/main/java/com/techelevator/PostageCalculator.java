package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {

		List<DeliveryDriver> deliveryOptions = new ArrayList<DeliveryDriver>();
		deliveryOptions.add(new FirstClassMail());
		deliveryOptions.add(new SecondClassMail());
		deliveryOptions.add(new ThirdClassMail());
		deliveryOptions.add(new FexEd());
		deliveryOptions.add(new FourDayGround());
		deliveryOptions.add(new TwoDayBusiness());
		deliveryOptions.add(new NextDay());
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please, enter the weight of the package: ");
		double weight = in.nextDouble();
		in.nextLine();
		
		System.out.print("\n(P)ounds or (O)unces? ");
		if(in.next().contentEquals("O")) {
			weight = weight/16;
		}
		
		System.out.print("\nWhat distance will it be traveling in miles? ");
		int distance = in.nextInt();
		in.nextLine();
		
		System.out.printf("\n%-30s %-20s\n", "Delivery Method", "$ cost");
		System.out.println("-------------------------------------------");
		
		for(DeliveryDriver deliveryOption : deliveryOptions) {
			
			BigDecimal roundedCost = new BigDecimal(deliveryOption.calculateRate(distance, weight));
			roundedCost = roundedCost.setScale(2, RoundingMode.HALF_UP);
			double finalCost = roundedCost.doubleValue();
			System.out.printf("\n%-30s %-20s", deliveryOption.getName(), "$" + Double.toString(finalCost));
		}


	}



}


