package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
	
	private StringBits stringBits;
	
	@Before
	public void setup() {
		stringBits = new StringBits();
	}
	
//	""			""
	@Test
	public void empty_string_returns_empty_string() {
		String result = stringBits.getBits("");
		Assert.assertEquals("",result);
	}
//	"Ok"		"O"
	@Test
	public void ok_string_returns_o() {
		String result = stringBits.getBits("Ok");
		Assert.assertEquals("O",result);
	}
//	"yakuzoku"   "ykzk"
	@Test
	public void yakuzoku_returns_ykzk() {
		String result = stringBits.getBits("yakuzoku");
		Assert.assertEquals("ykzk",result);
	}
//	"sauypoewre"  "super"
	@Test
	public void sauypoewre_returns_super() {
		String result = stringBits.getBits("sauypoewre");
		Assert.assertEquals("super",result);
	}
	
	

}
