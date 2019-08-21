package com.techelevator.exceptions.calc;

import java.util.ArrayList;
import java.util.List;

public class FranklinCountyTaxCalculator implements Calculator {


	@Override
	public List<String> calculate(List<String> values) {
		List<String> results = new ArrayList<String>();
		
		for (String value : values) {
			double amt = Double.parseDouble(value);
			double rate = amt * 0.075;
			results.add(String.valueOf(rate));
		}
		
		return results;
	}

}
