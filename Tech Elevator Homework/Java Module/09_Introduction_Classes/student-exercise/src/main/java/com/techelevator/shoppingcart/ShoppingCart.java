package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0.0;
		}
		else {
			return totalAmountOwed / totalNumberOfItems;
		}
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = 0 + numberOfItems;
		totalAmountOwed += 0.00 + pricePerItem * numberOfItems;
	}
	
	public void empty() {
		totalAmountOwed = 0.00;
		totalNumberOfItems = 0;
	}
	
	
}
