package com.techelevator;

public class LectureExtra {

	public static void main(String[] args) {
		
		// Sum all the numbers between 1 and 10
		int sum = 0;
		for (int i = 0 ; i <= 10 ; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
		// Sum All Even numbers 
		int sumEvenOne = 0;
		for (int i = 0 ; i <= 100 ; i++) {
			if (i % 2 == 0) {
				sumEvenOne += i;
			}
		}
		System.out.println("Sum of Even (first way)= " + sumEvenOne);
		
		// Sum All Even numbers by counting by 2s
		int sumEvenTwo = 0;
		for (int i = 2 ; i <= 100; i += 2) {
			sumEvenTwo += i;
		}
		System.out.println("Sum of Even (second way)= " + sumEvenTwo);
		
		// Sum All Even numbers by continuing on odds
		int sumEvenThree = 0;
		for (int i = 0 ; i <= 100 ; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sumEvenThree += i;
		}
		System.out.println("Sum of Even (third way)= " + sumEvenThree);
		
		// Print all 0 to 100 in reverse
		for (int i = 100; i >= 0 ; i--) {
			System.out.print(i + " ");
		}
		
		
		String[] instructors = new String[5];
		instructors[0] = "Steve";
		instructors[1] = "Rachelle";
		instructors[2] = "Stephanie";
		instructors[3] = "John";
		instructors[4] = "Andrew";
		
		System.out.println("\nPrint all the instructors");
		// Print all the instructors
		for (int i = 0; i < instructors.length ; i++) {
			System.out.println(instructors[i]);
		}
		
		System.out.println("Print out the odd instructors");
		// Print all the odd instructors
		for (int i = 0 ; i < instructors.length ; i++) {
			if (i % 2 == 1) {
				System.out.println(instructors[i]);
			}
		}
		
		System.out.println("Print out the first odd instructors");
		// Print all the odd instructors
		for (int i = 0 ; i < instructors.length ; i++) {
			if (i % 2 == 1) {
				System.out.println(instructors[i]);
				break;
			}
		}
		
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10 };
		// Double every number in the Array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 2;
			System.out.println(numbers[i]);
		}
		
		int x = 0;
		for ( ; true ; ) {
			System.out.println(instructors[x]);
			x++;
			if (x >= instructors.length) {
				break;
			}
		}
		
	}

}
