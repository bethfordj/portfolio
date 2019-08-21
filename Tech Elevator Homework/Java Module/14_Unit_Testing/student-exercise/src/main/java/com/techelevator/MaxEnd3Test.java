package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
	
	private MaxEnd3 maxEnd3;
	
	@Before
	public void setup() {
		maxEnd3 = new MaxEnd3();
	}
	
//	[1,5,9,3]    null
	@Test
	public void array_that_is_too_long(){
		int[] testArray = {1,5,9,3};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(null, result);
	}
//	[2]			null
	@Test
	public void array_that_is_too_short(){
		int[] testArray = {2};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(null, result);
	}
//	[2,-11,0]	[2,2,2]
	@Test
	public void array_with_ends_2_and_0(){
		int[] testArray = {2,-11,0};
		int[] expectedArray = {2,2,2};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, result);
	}
//	[-2,14,-5]	[-2,-2,-2]
	@Test
	public void array_with_ends_negative_2_and_negative_5(){
		int[] testArray = {-2,14,-5};
		int[] expectedArray = {-2,-2,-2};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, result);
	}
//	[5,200,5]	[5,5,5]
	@Test
	public void array_with_ends_5_both_ends_with_larger_middle(){
		int[] testArray = {5,200,5};
		int[] expectedArray = {5,5,5};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, result);
	}
//	[-40,-4,0]	[0,0,0]
	@Test
	public void array_with_ends_negative_and_0(){
		int[] testArray = {-40,-4,0};
		int[] expectedArray = {0,0,0};
		int[] result = maxEnd3.makeArray(testArray);
		Assert.assertArrayEquals(expectedArray, result);
	}
	
	
	
	

}
