package com.techelevator.exceptions.calc;

import java.util.List;

public class MainTaxCalc {

	public static void main(String[] args) {
	
		
			Menu menu = new Menu();
			Calculator salesTax = new FranklinCountyTaxCalculator();
			
			List<String> values = menu.getValuesFromUser();

			List<String> results = salesTax.calculate(values);	
		
			for (String result : results) {
				menu.displayUserMessage(result);
			}
	
	}

}
