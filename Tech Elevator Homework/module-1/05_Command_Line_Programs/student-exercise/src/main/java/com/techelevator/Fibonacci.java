package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		

		
		System.out.print("Please, enter the Fibonacci number: ");
		int fibonacciInteger = in.nextInt();

		int y = 1;
		int z = 0;
		
		if (fibonacciInteger < 1) {
			System.out.print("0");
		}
		
		else if (fibonacciInteger == 1) {
			System.out.print("0 1 1");
		}
		
		else {
			System.out.print("0 1 1 ");
		for (int x = 1; z + y <= fibonacciInteger; x = z) {
			z = x + y;
			y = x;
	
			System.out.print(z + " ");
		}

	}

	}
}
