package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	
	private SameFirstLast sameFirstLast;
	
	@Before
	public void setup() {
		sameFirstLast = new SameFirstLast();
	}
	
//	[]    false
	@Test
	public void empty_array_no_length_false() {
		int[] testArray = {};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertFalse(result);
	}
//	[-1,1]	false
	@Test
	public void array_length_2_different_false() {
		int[] testArray = {-1,1};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertFalse(result);
	}
//	[9,11,-3]false
	@Test
	public void array_length_3_different_false() {
		int[] testArray = {9,11,-3};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertFalse(result);
	}
//	[200,5,-17,0,25] false
	@Test
	public void array_5_long_different_false() {
		int[] testArray = {200,5,-17,0,25};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertFalse(result);
	}
//	[1000]  true
	@Test
	public void array_1_long_1000_true() {
		int[] testArray = {1000};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
//	[-11]   true
	@Test
	public void array_1_long_negative_true() {
		int[] testArray = {-11};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
//	[0]    true
	@Test
	public void array_1_long_0_true() {
		int[] testArray = {0};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
//	[1,1]	true
	@Test
	public void array_2_long_both_1_true() {
		int[] testArray = {1,1};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
//	[4, -4, 4]	true
	@Test
	public void array_3_long_first_last_4_true() {
		int[] testArray = {4,-4,4};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
//	[500,1,2,0,-3,16,500]
	@Test
	public void array_7_long_first_last_500_true() {
		int[] testArray = {500,1,2,0,-3,16,500};
		boolean result = sameFirstLast.isItTheSame(testArray);
		Assert.assertTrue(result);
	}
			
	
	
	

}
