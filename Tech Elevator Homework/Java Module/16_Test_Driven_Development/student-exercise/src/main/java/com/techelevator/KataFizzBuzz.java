package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		if(number < 1 || number > 100) {
			return "";
		}
		else if(isMultipleOf3And5(number)||(contains3And5(number))) {
			return "FizzBuzz";
		}
		else if(isMultipleOf3(number) || contains3(number)) {
			return "Fizz";
		}
		else if (isMultipleOf5(number) || contains5(number)) {
			return "Buzz";
		}

		else {
			return Integer.toString(number);
		}

	}
	
	public boolean isMultipleOf5(int number) {
		return number%5 == 0;
	}
	
	public boolean isMultipleOf3(int number) {
		return number%3 == 0;
	}
	
	public boolean isMultipleOf3And5(int number) {
		return (isMultipleOf3(number) && isMultipleOf5(number));
	}
	
	public boolean contains3And5(int number) {
		return (contains3(number) && contains5(number));
	}
	
	public boolean contains3(int number) {
		return Integer.toString(number).contains("3");
	}
	
	public boolean contains5(int number) {
		return Integer.toString(number).contains("5");
	}

}
