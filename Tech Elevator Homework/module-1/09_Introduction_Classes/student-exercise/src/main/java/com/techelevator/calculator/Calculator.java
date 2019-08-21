package com.techelevator.calculator;

public class Calculator {

	private int result;

	public int getResult() {
		return result;
	}
	
	public int add(int addend) {
		return result += addend;
	}
	
	public int multiply(int multiplier) {
		return result = result * multiplier;
	}
	
	public int power(int exponent) {
		double decimalResult = (double)result;
		double decimalExponent = (double)exponent;
		return result = (int)Math.pow(decimalResult,Math.abs(decimalExponent));
	}
	
	public void reset() {
		result = 0;
	}
	
	public int subtract(int subtrahend) {
		return result = result - subtrahend;
	}
	
	
}
