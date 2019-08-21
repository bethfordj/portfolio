package com.techelevator.exceptions.calc;

import java.util.List;

public class MainStringCalc {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Calculator strCalc = new StringCalculator();
		
		List<String> values = menu.getValuesFromUser();

		try {
			List<String> results = strCalc.calculate(values);	
			
			for (String result : results) {
				menu.displayUserMessage(result);
			}
		} catch (NullPointerException e) {
			menu.displayUserMessage("The list was null");
		} catch (InvalidStringException e) {
			menu.displayUserMessage("We don't handle the " + e.getOriginalValue());
		}


	}

}
