package com.techelevator;

public class LectureExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sum all the numbers between 1 and 10
		int sum = 0;
			
		for(int i = 0; i < 11 ; i++) {
			sum +=i;

	}
	System.out.println(sum);

	
	int sumEvenOne = 0;
	for(int i = 0; i < 101; i++) {
		if (i%2==0) {
			sumEvenOne += i;
		}
	}
	System.out.println("Sum of Even (first way)= " + sumEvenOne);
	
	int sumEvenTwo = 0;
	for (int i = 2; i < 101; i += 2) {
		sumEvenTwo += i;
	}
	System.out.println("Sum of Even (second way)= " + sumEvenTwo);
	
	// print all integers from 100 to 0 in that order
	
	for (int i = 100; i >= 0; i-- ) {
		System.out.print(i + " ");
	}

	
	String[] instructors = new String[5];
	instructors[0] = "Steve";
	instructors[1] = "Rachelle";
	instructors[2] = "Stephanie";
	instructors[3] = "John";
	instructors[4] = "Andrew";
	
	System.out.println("\nPrint all the instructors");
	
	// print all the instructors
	for (int i = 0; i < instructors.length ; i++) {
		System.out.println(instructors[i]);
	}
	
	for (int i = 0; i < instructors.length ; i++) {
		if (i%2 == 1) {
			System.out.println(instructors[i]);
		}
	}
	int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = 2 * numbers[i];
		System.out.println(numbers[i]);
	}
	
}
}