package com.techelevator;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataRomanNumerals {
	
	private static Map<Integer, String> intToRomanNumeral = new HashMap<Integer,String>();
	private static Map<String, Integer> romanToInt = new HashMap<String, Integer>();
	

	
	public KataRomanNumerals() {
		intToRomanNumeral.put(1,"I");
		intToRomanNumeral.put(5,"V");
		intToRomanNumeral.put(10,"X");
		intToRomanNumeral.put(50,"L");
		intToRomanNumeral.put(100,"C");
		intToRomanNumeral.put(500,"D");
		intToRomanNumeral.put(1000,"M");
		
		romanToInt.put("I",1);
		romanToInt.put("IV",4);
		romanToInt.put("V",5);
		romanToInt.put("IX",9);
		romanToInt.put("X",10);
		romanToInt.put("XL",40);
		romanToInt.put("L",50);
		romanToInt.put("XC",90);
		romanToInt.put("C",100);
		romanToInt.put("CD",400);
		romanToInt.put("D",500);
		romanToInt.put("CM",900);
		romanToInt.put("M",1000);
	}
	
	
	String finalString = "";

	String convertToRomanNumeral(int n) {

		if (n <= 0) {
			return null;
		}
		else if (intToRomanNumeral.containsKey(n)) {
			return intToRomanNumeral.get(n);
		}
		else {
			for(int i = 0; n > 0 ; i++) {
				String placeValue = getPlaceValue(n);
				finalString += placeValue;
				n -= romanToInt.get(placeValue);
			}
			return finalString;
		}
	}
	
	
	int convertToDigit(String romanNumeral) {
		
		int letterSum = 0;
		
		if (romanNumeral.length() == 1) {
			letterSum = romanToInt.get(romanNumeral);
			return letterSum;
		}
		
		List<String> letterList = new ArrayList<String>();
		for(int i = 0; i < romanNumeral.length() - 1;i++) {
			letterList.add(romanNumeral.substring(i, i + 1));
		}
		letterList.add(romanNumeral.substring((romanNumeral.length()-1)));
		
		for(int i = 0; i < letterList.size() - 1 ; i++) {
			int currentLetter = romanToInt.get(letterList.get(i));
			int nextLetter = romanToInt.get(letterList.get(i + 1));
			
			if (currentLetter < nextLetter) {
				currentLetter = -currentLetter;
			}
			letterSum += currentLetter;
		}	
		
		
		return letterSum + romanToInt.get(letterList.get(letterList.size() - 1));
	}
	
	

	
	public String getPlaceValue(int n) {
		String placeValue = "";
		if (n >= 1000) {
			placeValue = intToRomanNumeral.get(1000);
		}
		else if (n >= 900) {
			placeValue = intToRomanNumeral.get(100) + intToRomanNumeral.get(1000);
		}
		else if (n >= 500) {
			placeValue = intToRomanNumeral.get(500);
		}
		else if(n >= 400) {
			placeValue = intToRomanNumeral.get(100) + intToRomanNumeral.get(500);
		}
		else if(n >= 100) {
			placeValue = intToRomanNumeral.get(100);
		}
		else if(n >= 90) {
			placeValue = intToRomanNumeral.get(10) + intToRomanNumeral.get(100);
		}
		else if (n >= 50) {
			placeValue = intToRomanNumeral.get(50);
		}
		else if (n >= 40) {
			placeValue = intToRomanNumeral.get(10) + intToRomanNumeral.get(50);
		}
		else if (n >= 10) {
			placeValue = intToRomanNumeral.get(10);
		}
		else if (n == 9) {
			placeValue = intToRomanNumeral.get(1) + intToRomanNumeral.get(10);
		}
		else if (n >= 5) {
			placeValue = intToRomanNumeral.get(5);
		}
		else if (n == 4) {
			placeValue = intToRomanNumeral.get(1) + intToRomanNumeral.get(5);
		}
		else {
			placeValue = intToRomanNumeral.get(1);
		}
		return placeValue;	
	}
	
	
}

