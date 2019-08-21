package com.techelevator.staticExample;

public class Store {

	public static void main(String[] args) {
		CashRegister one = new CashRegister();
		CashRegister two = new CashRegister();
		
		
		one.makeSale(10);
		
		System.out.println("Register one made a sale for $10");
		System.out.println("Register one has " + one.getAmount());
		System.out.println("Register two has " + two.getAmount());
		System.out.println("The Store has " + CashRegister.getTotalAmount());
		
		two.makeSale(5);
		
		System.out.println();
		System.out.println("Register two made a sale for $5");
		System.out.println("Register one has " + one.getAmount());
		System.out.println("Register two has " + two.getAmount());
		System.out.println("The Store has " + CashRegister.getTotalAmount());
		
		one.makeSale(20);
		
		System.out.println();
		System.out.println("Register one made a sale for $20");
		System.out.println("Register one has " + one.getAmount());
		System.out.println("Register two has " + two.getAmount());
		System.out.println("The Store has " + CashRegister.getTotalAmount());
	}
	

	
}
