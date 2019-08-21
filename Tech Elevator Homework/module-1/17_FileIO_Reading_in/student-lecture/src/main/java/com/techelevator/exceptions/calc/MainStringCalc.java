package com.techelevator.exceptions.calc;

import java.util.List;

public class MainStringCalc {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Calculator strCalc = new StringCalculator();
		
		List<String> values = menu.getValuesFromUser();

		List<String> results = strCalc.calculate(values);	
		
		for (String result : results) {
			menu.displayUserMessage(result);
		}


	}

}
