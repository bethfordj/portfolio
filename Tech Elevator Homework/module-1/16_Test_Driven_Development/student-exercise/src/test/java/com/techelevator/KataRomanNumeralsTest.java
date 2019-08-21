package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.beans.Visibility;
import java.lang.management.MemoryManagerMXBean;

import javax.xml.bind.annotation.XmlList;

public class KataRomanNumeralsTest {
	
	private KataRomanNumerals kataRomanNumerals;
	
	@Before
	public void setup() {
		kataRomanNumerals = new KataRomanNumerals();
	}
	
//	(1) return I
	@Test
	public void for_1_return_I() {
		String result = kataRomanNumerals.convertToRomanNumeral(1);
		Assert.assertEquals("I",result);
	}
//	(2) return II
	@Test
	public void for_2_return_II() {
		String result = kataRomanNumerals.convertToRomanNumeral(2);
		Assert.assertEquals("II",result);
	}
//	(4) return IV
	@Test
	public void for_4_return_IV() {
		String result = kataRomanNumerals.convertToRomanNumeral(4);
		Assert.assertEquals("IV",result);
	}
//	(5) return V
	@Test
	public void for_5_return_V() {
		String result = kataRomanNumerals.convertToRomanNumeral(5);
		Assert.assertEquals("V",result);
	}
//	(8) return VIII 
	@Test
	public void for_8_return_VIII() {
		String result = kataRomanNumerals.convertToRomanNumeral(8);
		Assert.assertEquals("VIII",result);
	}
//	(9) return IX 
	@Test
	public void for_9_return_IX() {
		String result = kataRomanNumerals.convertToRomanNumeral(9);
		Assert.assertEquals("IX",result);
	}
//	(40) return XL 
	@Test
	public void for_40_return_XL() {
		String result = kataRomanNumerals.convertToRomanNumeral(40);
		Assert.assertEquals("XL",result);
	}
//	(100) return C 
	@Test
	public void for_100_return_C() {
		String result = kataRomanNumerals.convertToRomanNumeral(100);
		Assert.assertEquals("C",result);
	}
//	(50) return L
	@Test
	public void for_50_return_L() {
		String result = kataRomanNumerals.convertToRomanNumeral(50);
		Assert.assertEquals("L",result);
	}
//	(500) return D 
	@Test
	public void for_500_return_D() {
		String result = kataRomanNumerals.convertToRomanNumeral(500);
		Assert.assertEquals("D",result);
	}
//	(490) return CDXC
	@Test
	public void for_490_return_CDXC() {
		String result = kataRomanNumerals.convertToRomanNumeral(490);
		Assert.assertEquals("CDXC",result);
	}
//	(3000) return MMM 
	@Test
	public void for_3000_return_MMM() {
		String result = kataRomanNumerals.convertToRomanNumeral(3000);
		Assert.assertEquals("MMM",result);
	}
//	(2999) return MMCMXCIX
	@Test
	public void for_2999_return_MMCMXCIX() {
		String result = kataRomanNumerals.convertToRomanNumeral(2999);
		Assert.assertEquals("MMCMXCIX",result);
	}
//	(0) return null
	@Test
	public void for_0_return_null() {
		String result = kataRomanNumerals.convertToRomanNumeral(0);
		Assert.assertEquals(null,result);
	}
//	(-1) return null
	@Test
	public void for_negatives_return_null() {
		String result = kataRomanNumerals.convertToRomanNumeral(-1);
		Assert.assertEquals(null,result);
	}
	
	
	/* <<<<<<<<<< Part 2 >>>>>>>>>>>>>>>>*/
	
//	D return 500
	@Test
	public void for_D_return_500() {
		int result = kataRomanNumerals.convertToDigit("D");
		Assert.assertEquals(500,result);
	}
//	CDXC return 490
	@Test
	public void for_CDXC_return_490() {
		int result = kataRomanNumerals.convertToDigit("CDXC");
		Assert.assertEquals(490,result);
	}
//	MMCMXCIX return 2999
	@Test
	public void for_MMCMXCIX_return_2999() {
		int result = kataRomanNumerals.convertToDigit("MMCMXCIX");
		Assert.assertEquals(2999,result);
	}
//	MMM return 3000
	@Test
	public void for_MMM_return_3000() {
		int result = kataRomanNumerals.convertToDigit("MMM");
		Assert.assertEquals(3000,result);
	}
	
	
	
	
	

}
