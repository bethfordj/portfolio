package com.techelevator.exceptions.calc;

import java.util.List;

public class MainTaxCalc {

	public static void main(String[] args) {
	
		
			Menu menu = new Menu();
			Calculator salesTax = new FranklinCountyTaxCalculator();
			
			List<String> values = menu.getValuesFromUser();

			try {
				List<String> results = salesTax.calculate(values);	
			
				for (String result : results) {
					menu.displayUserMessage(result);
				}
			} catch (NumberFormatException e) {
				menu.displayUserMessage("Invalid Input, please try again");
			} catch(NullPointerException e) {
				menu.displayUserMessage("The list was empty, please try again");
			} catch (Exception e) {
				menu.displayUserMessage("There was an unknown error!");
				e.printStackTrace();
			}
	
	}

}
