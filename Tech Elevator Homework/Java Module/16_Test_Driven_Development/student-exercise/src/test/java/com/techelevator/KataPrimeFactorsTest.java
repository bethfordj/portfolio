package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactorsTest {
	

	private KataPrimeFactors kataPrimeFactors;
	
	@Before
	public void setup() {
		kataPrimeFactors = new KataPrimeFactors();
	}

//	(1)  null
	@Test
	public void for_1_return_null() {
		List<Integer> actualResult = kataPrimeFactors.factorize(1);
		Assert.assertEquals(null, actualResult);
	}
//	(2)  [2]
	@Test
	public void for_2_return_list_of_2() {
		List<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(2);
		List<Integer> actualResult = kataPrimeFactors.factorize(2);
		Assert.assertEquals(expectedResult, actualResult);
	}
//	(6)	 [2,3]
	@Test
	public void for_6_return_list_of_2_and_3() {
		List<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(2);
		expectedResult.add(3);
		List<Integer> actualResult = kataPrimeFactors.factorize(6);
		Assert.assertEquals(expectedResult, actualResult);
	}
//	(25)  [5,5]
	@Test
	public void for_25_return_list_of_5_and_5() {
		List<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(5);
		expectedResult.add(5);
		List<Integer> actualResult = kataPrimeFactors.factorize(25);
		Assert.assertEquals(expectedResult, actualResult);
	}
//	(36) [2,2,3,3]
	@Test
	public void for_36_return_list_of_two_2s_and_two_3s() {
		List<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(2);
		expectedResult.add(2);
		expectedResult.add(3);
		expectedResult.add(3);
		List<Integer> actualResult = kataPrimeFactors.factorize(36);
		Assert.assertEquals(expectedResult, actualResult);
	}
//	(52) [2,2,13]
	@Test
	public void for_52_return_list_of_two_2s_and_13() {
		List<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(2);
		expectedResult.add(2);
		expectedResult.add(13);
		List<Integer> actualResult = kataPrimeFactors.factorize(52);
		Assert.assertEquals(expectedResult, actualResult);
	}

}
