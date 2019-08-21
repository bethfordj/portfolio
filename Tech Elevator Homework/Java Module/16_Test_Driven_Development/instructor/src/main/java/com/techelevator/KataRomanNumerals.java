package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	public int convertToDigit(String romanNumeral) {
		
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		
		int number = 0;
		
		for (int i = 0 ; i < romanNumeral.length() ; i++) {
			char numeral = romanNumeral.charAt(i);
			number += romanMap.get(numeral);
		}
		
		return number;
	}
}
