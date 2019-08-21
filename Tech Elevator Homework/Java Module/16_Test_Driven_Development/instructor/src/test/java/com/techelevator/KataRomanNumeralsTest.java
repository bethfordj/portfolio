package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	private KataRomanNumerals romanNumerals;
	
	@Before
	public void setup() {
		romanNumerals = new KataRomanNumerals();
	}
	
	@Test
	public void one_characters_numbers() {
		int num = romanNumerals.convertToDigit("I");
		Assert.assertEquals("Incorrect value for I", 1, num);
		
		num = romanNumerals.convertToDigit("V");
		Assert.assertEquals("Incorrect value for V", 5, num);
	}
	
	@Test
	public void two_character_numbers_that_are_not_groups() {
		int num = romanNumerals.convertToDigit("II");
		Assert.assertEquals("Incorrect value for II", 2, num);
	}
}
