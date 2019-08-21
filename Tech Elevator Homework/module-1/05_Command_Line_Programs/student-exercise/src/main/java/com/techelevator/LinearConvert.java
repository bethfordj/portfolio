package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
	/*m = f * 0.3048
The meter to foot conversion formula is:

f = m * 3.2808399
Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

Please enter the length: 58
Is the measurement in (m)eter, or (f)eet? f
58f is 17m.*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please, enter the length. Then, indicate whether the measurement is in meters (m) or feet (f): ");
		
		double measurementInput = in.nextDouble();
		String generalInput = in.next();
		double measurementOutput;
		
		
		if (generalInput.contains("m")) {
			measurementOutput = measurementInput * 3.2808399;
			
			System.out.print(measurementInput + " meters is " + measurementOutput + " feet.");
			
		}
		
		else if (generalInput.contains("f")) {
			
			measurementOutput = measurementInput * 0.3048;
			System.out.print(measurementInput + " feet is " + measurementOutput + " meters.");
			
		}


		

	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
