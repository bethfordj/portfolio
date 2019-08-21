package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
	
	private NonStart nonStart;
	
	@Before
	public void setup() {
		nonStart = new NonStart();
	}
	
//	""+"a"   null
	@Test
	public void empty_string_and_1_long_null() {
		String result = nonStart.getPartialString("", "a");
		Assert.assertEquals(null,result);
	}
//	"a" + "t"  ""
	@Test
	public void two_single_letters_results_in_empty_string() {
		String result = nonStart.getPartialString("a", "t");
		Assert.assertEquals("",result);
	}
//	"la" + "it"  "at"
	@Test
	public void la_and_it_make_at() {
		String result = nonStart.getPartialString("la", "it");
		Assert.assertEquals("at",result);
	}
//	"pin" + "tin"   "inin"
	@Test
	public void pin_and_tin_make_inin() {
		String result = nonStart.getPartialString("pin", "tin");
		Assert.assertEquals("inin",result);
	}
//	"drain" + "sing"  "raining"
	@Test
	public void drain_and_sing_make_raining() {
		String result = nonStart.getPartialString("drain", "sing");
		Assert.assertEquals("raining",result);
	}
	
	
	
	

}
