package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	private KataFizzBuzz kataFizzBuzz;
	
	@Before
	public void setup() {
		kataFizzBuzz = new KataFizzBuzz();
	}
	
	
//	(9) returns "Fizz"
	@Test
	public void multiple_of_3_not_5_returns_Fizz() {
		String result = kataFizzBuzz.fizzBuzz(9);
		Assert.assertEquals("Fizz",result);
	}
//	(10) returns "Buzz"
	@Test
	public void multiple_of_5_not_3_returns_Buzz() {
		String result = kataFizzBuzz.fizzBuzz(10);
		Assert.assertEquals("Buzz",result);
	}
//	(15) returns "FizzBuzz"
	@Test
	public void multiple_of_5_and_3_returns_FizzBuzz() {
		String result = kataFizzBuzz.fizzBuzz(15);
		Assert.assertEquals("FizzBuzz",result);
	}
//	(1) returns "1"
	@Test
	public void not_multiple_of_5_or_3_returns_number_as_string() {
		String result = kataFizzBuzz.fizzBuzz(1);
		Assert.assertEquals("1",result);
	}
//	(98) returns "98"
	@Test
	public void highest_nonmultiple_of_5_or_3_returns_number_as_string() {
		String result = kataFizzBuzz.fizzBuzz(98);
		Assert.assertEquals("98",result);
	}
//	(101) returns ""
	@Test
	public void one_over_max_range_returns_empty_string() {
		String result = kataFizzBuzz.fizzBuzz(101);
		Assert.assertEquals("",result);
	}
//	(100) returns "Buzz"
	@Test
	public void highest_multiple_of_5_returns_Buzz() {
		String result = kataFizzBuzz.fizzBuzz(100);
		Assert.assertEquals("Buzz",result);
	}
//	(0) returns ""
	@Test
	public void zero_returns_empty_string() {
		String result = kataFizzBuzz.fizzBuzz(0);
		Assert.assertEquals("",result);
	}
	
//	(-15) returns ""
	@Test
	public void negative_number_returns_empty_string() {
		String result = kataFizzBuzz.fizzBuzz(-15);
		Assert.assertEquals("",result);
	}
//	(450000000) returns ""
	@Test
	public void multiple_of_both_above_100_returns_empty_string() {
		String result = kataFizzBuzz.fizzBuzz(450000000);
		Assert.assertEquals("",result);
	}
//	(23) returns "Fizz"
	@Test
	public void contains_3_but_not_multiple_of_3() {
		String result = kataFizzBuzz.fizzBuzz(23);
		Assert.assertEquals("Fizz",result);
	}
//	(52) returns "Buzz"
	@Test
	public void contains_5_but_not_multiple_of_5() {
		String result = kataFizzBuzz.fizzBuzz(52);
		Assert.assertEquals("Buzz",result);
	}
	@Test
//	(53) returns "FizzBuzz"
	public void contains_3_and_5_but_is_not_multiple_of_3_or_5() {
		String result = kataFizzBuzz.fizzBuzz(53);
		Assert.assertEquals("FizzBuzz",result);
	}
	
	
	
	

}
