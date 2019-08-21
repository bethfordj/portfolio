package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
	
	private Lucky13 lucky13;
	
	@Before
	public void setup() {
		lucky13 = new Lucky13();
	}
	
//	[-1,2,40]   true
	@Test
	public void negative_1_but_no_1_or_3_true() {
		int[] testArray = {-1,2,40};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertTrue(result);	
	}
//	[-3,0,24]	true
	@Test
	public void negative_3_but_no_1_or_3_true() {
		int[] testArray = {-3,0,24};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertTrue(result);	
	}
//	[-11,13,31,33,111,131]	true
	@Test
	public void numbers_containing_1_and_3_but_no_1_or_3_true() {
		int[] testArray = {-11,13,31,33,111,131};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertTrue(result);	
	}
//	[-13,1,23] false
	@Test
	public void numbers_containing_1_and_3_and_1_false() {
		int[] testArray = {-13,1,23};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertFalse(result);	
	}
//	[-4,44,3]	false
	@Test
	public void numbers_not_containing_1_and_3_and_3_false() {
		int[] testArray = {-4,44,3};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertFalse(result);	
	}
//	[1,3]		false
	@Test
	public void array_of_only_1_and_3_false() {
		int[] testArray = {1,3};
		boolean result = lucky13.getLucky(testArray);
		Assert.assertFalse(result);	
	}
	
	

}
