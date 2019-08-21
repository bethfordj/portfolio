package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DateFashionTest {
	
	private DateFashion dateFashion;
	
	@Before
	public void setup() {
		dateFashion = new DateFashion();
	}
	
//	 getATable(-1,-3)   0
	@Test
	public void you_and_date_have_negative_fashion_sense() {
		int result = dateFashion.getATable(-1, -3);
		Assert.assertEquals(0,result);
	}
//	 getATable(-1, 3)   0
	@Test
	public void you_have_negative_fashion_date_has_low() {
		int result = dateFashion.getATable(-1,3);
		Assert.assertEquals(0,result);
	}
//	 getATable(10, -4)  0
	@Test
	public void you_have_max_fashion_date_has_negative() {
		int result = dateFashion.getATable(10, -4);
		Assert.assertEquals(0,result);
	}
//	 getATable(0,1)     0
	@Test
	public void you_have_no_fashion_date_has_low() {
		int result = dateFashion.getATable(0, 1);
		Assert.assertEquals(0,result);
	}
//	 getATable(2,8)     0
	@Test
	public void you_have_low_fashion_date_has_high() {
		int result = dateFashion.getATable(2, 8);
		Assert.assertEquals(0,result);
	}
//	 getATable(10, 3)   2
	@Test
	public void you_have_max_fashion_date_has_midlow() {
		int result = dateFashion.getATable(10, 3);
		Assert.assertEquals(2,result);
	}
//	 getATable(14,5)    2
	@Test
	public void you_have_above_max_fashion_date_has_mid() {
		int result = dateFashion.getATable(14, 5);
		Assert.assertEquals(2,result);
	}
//	 getATable(20,45)   2
	@Test
	public void you_and_date_have_over_max_fashion() {
		int result = dateFashion.getATable(20, 45);
		Assert.assertEquals(2,result);
	}
//	 getATable(3,7)     1
	@Test
	public void you_have_3_fashion_date_has_7() {
		int result = dateFashion.getATable(3, 7);
		Assert.assertEquals(1,result);
	}
//	 getATable(4, 5)    1
	@Test
	public void you_have_4_fashion_date_has_5() {
		int result = dateFashion.getATable(4, 5);
		Assert.assertEquals(1,result);
	}












}
