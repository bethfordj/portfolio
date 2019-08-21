package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
	
	private Less20 less20;
	
	@Before
	public void setup() {
		less20 = new Less20();
	}
	
//	(-2)   false
	@Test
	public void negative_2_return_false() {
		boolean result = less20.isLessThanMultipleOf20(-2);
		Assert.assertFalse(result);
	}
//	(0)	   false
	@Test
	public void zero_return_false() {
		boolean result = less20.isLessThanMultipleOf20(0);
		Assert.assertFalse(result);
	}
//	(18)   true
	@Test
	public void eighteen_return_true() {
		boolean result = less20.isLessThanMultipleOf20(18);
		Assert.assertTrue(result);
	}
//	(20)	false
	@Test
	public void twenty_return_false() {
		boolean result = less20.isLessThanMultipleOf20(20);
		Assert.assertFalse(result);
	}
//	(79)	true
	@Test
	public void seventynine_return_true() {
		boolean result = less20.isLessThanMultipleOf20(79);
		Assert.assertTrue(result);
	}
//	(87)	false
	@Test
	public void eightyseven_return_false() {
		boolean result = less20.isLessThanMultipleOf20(87);
		Assert.assertFalse(result);
	}

}
