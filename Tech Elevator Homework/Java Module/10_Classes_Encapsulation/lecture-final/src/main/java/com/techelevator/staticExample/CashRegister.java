package com.techelevator.staticExample;

public class CashRegister {

	private static int totalAmount;
	
	private int amount;
	
	public void makeSale(int amount) {
		this.amount += amount;
		totalAmount += amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public static int getTotalAmount() {
		return totalAmount;
	}
}
