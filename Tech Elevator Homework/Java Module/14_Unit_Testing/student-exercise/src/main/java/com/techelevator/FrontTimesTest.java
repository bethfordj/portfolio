package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {
	
	private FrontTimes frontTimes;
	
	@Before
	public void setup() {
		frontTimes = new FrontTimes();
	}
	
//	("yakusoku",-3)   ""
	@Test
	public void word_yakusoku_with_negative_3() {
		String result = frontTimes.generateString("yakusoku", -3);
		Assert.assertEquals("",result);
	}
//	("yakusoku",0)  ""
	@Test
	public void word_yakusoku_with_0() {
		String result = frontTimes.generateString("yakusoku", 0);
		Assert.assertEquals("",result);
	}
//	("si",-20)      ""
	@Test
	public void word_si_with_negative_20() {
		String result = frontTimes.generateString("si", -20);
		Assert.assertEquals("",result);
	}
//	("si", 0)       ""
	@Test
	public void word_si_with_0() {
		String result = frontTimes.generateString("si", 0);
		Assert.assertEquals("",result);
	}
//	("yakusoku",1)   "yak"
	@Test
	public void word_yakusoku_with_1() {
		String result = frontTimes.generateString("yakusoku", 1);
		Assert.assertEquals("yak",result);
	}
//	("si",1)         "si"
	@Test
	public void word_si_with_1() {
		String result = frontTimes.generateString("si", 1);
		Assert.assertEquals("si",result);
	}
//	("yakusoku",10)	"yakyakyakyakyakyakyakyakyakyak"
	@Test
	public void word_yakusoku_with_10() {
		String result = frontTimes.generateString("yakusoku", 10);
		Assert.assertEquals("yakyakyakyakyakyakyakyakyakyak",result);
	}
//	("s",20)		"sssssssssssssssssssss"
	public void word_s_with_20() {
		String result = frontTimes.generateString("s", 20);
		Assert.assertEquals("ssssssssssssssssssss",result);
	}
	

	

}
