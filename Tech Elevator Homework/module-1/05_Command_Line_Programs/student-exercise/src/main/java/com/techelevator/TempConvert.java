package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		/* The Fahrenheit to Celsius conversion formula is:

Tc = (Tf - 32) / 1.8
where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit

The Celsius to Fahrenheit conversion formula is:

Tf = Tc * 1.8 + 32
Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.

Please enter the temperature: 58
Is the temperature in (C)elcius, or (F)arenheit? F
58F is 14C. */
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the temperature followed by C for Celsius or F for Fahrenheit: ");
		
		double tempInput = in.nextInt();
		String tempTypeInput = in.next();
		double tempOutput;
		
		
		if (tempTypeInput.equals("f") || tempTypeInput.equals("F")) {
			tempOutput = (tempInput - 32) / 1.8;
			
			System.out.print(tempInput + " degrees Fahrenheit is " + tempOutput + " degrees Celsius.");
			
		}
		
		else if (tempTypeInput.equals("c") || tempTypeInput.equals("C")) {
			
			tempOutput = tempInput * 1.8 + 32;
			System.out.print(tempInput + " degrees Celsius is " + tempOutput + " degrees Fahrenheit.");
			
		} 
		
		else {
			System.out.print("I think something is missing. Did you enter all the information needed?");
		}


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
