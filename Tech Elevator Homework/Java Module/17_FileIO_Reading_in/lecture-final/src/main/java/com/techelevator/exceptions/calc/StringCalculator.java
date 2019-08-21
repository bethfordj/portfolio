package com.techelevator.exceptions.calc;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator implements Calculator {

	
	@Override
	public List<String> calculate(List<String> values) throws InvalidStringException {
		
		StringReverser reverser = new StringReverser();
		List<String> results = new ArrayList<String>();
		
		for (int i = 0; i < values.size(); i++) {
			
			if (values.get(i) != null && values.get(i).equalsIgnoreCase("Bob")) {
				throw new InvalidStringException("We don't allow that string", values.get(i));
			}
			
			
			String reversed = "";
			try {
				reversed = reverser.reverseString(values.get(i));
			} catch (NullPointerException e) {
				// We bury this exception, because we want the empty string when null.
				// Exceptions should only be buried for a specific Exception and only when
				// we know the consequences.  
			}
			results.add(reversed);
		}
		 
		return results;
	}

	
}
