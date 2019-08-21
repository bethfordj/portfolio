package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		

	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, enter in a series of integers values separated by spaces: ");


		

		
		// A loop to make the process repeat if multiple integers are written
		for ( ; true; ) {
			int decimalInput = in.nextInt();
			int newDecimalInput;

			if (decimalInput == 0) {
			System.out.println("0 is the binary version of 0.");
			continue;
			}
			
			else if (decimalInput == 1) {
				System.out.println("1 is the binary version of 1.");
				continue;
			}
			
			
			
			 // A loop to find the highest multiple of 2 that goes into the number
			for (int i = 21; i >= 0; i--) {
				
				if (decimalInput - Math.pow(2,i) < 0) {
					
					continue;
					
				}
				
				else if ((i == 0) && (decimalInput - Math.pow(2,i) == 0)) {
					System.out.print(1);
					break;
				}
				
				else if (decimalInput - Math.pow(2,i) == 0) {

					System.out.print(1);
					newDecimalInput = (int) (decimalInput - Math.pow(2,i));
		
					// A loop to include zeros once the first 1 is found if the previous power had no remainder
					for (i = i - 1; i >= 0; i--) {
						
						if (newDecimalInput - Math.pow(2,i) <= 0) {

							System.out.print(0);
						}
						
						else {
							break;
							}
						}
					}
				
				
				
				else if (decimalInput - Math.pow(2,i) > 0) {

					System.out.print(1);
					newDecimalInput = (int) (decimalInput - Math.pow(2,i));
		
					// A loop to include zeros once the first 1 is found (from the left)
					for (i = i - 1; i >= 0; i--) {
						
						if (newDecimalInput - Math.pow(2,i) < 0) {
							
							System.out.print(0);
							continue;
							
						}
						else if (newDecimalInput - Math.pow(2,i) >= 0) {

							System.out.print(1);
							newDecimalInput = (int) (newDecimalInput - Math.pow(2,i));
						}
						else {
							break;
						}
					
				}	
			}
			}
			

			System.out.println(" is the binary version of " + decimalInput + ".");
			continue;
		}
}
}