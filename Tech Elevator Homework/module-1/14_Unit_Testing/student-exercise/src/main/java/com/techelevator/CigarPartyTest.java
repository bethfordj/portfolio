package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert; 

public class CigarPartyTest {
	
	private CigarParty cigarParty;
	
	@Before
	public void beforeTests() {
		cigarParty = new CigarParty();
	}
	
	@Test
	public void Fifty_cigars_is_a_good_party_on_the_weekend() {
		boolean isGoodParty = cigarParty.haveParty(50, true);
		Assert.assertTrue(isGoodParty);
	}

	@Test
	public void Forty_cigars_is_a_good_party_on_a_weekday() {
		boolean isGoodParty = cigarParty.haveParty(40, false);
		Assert.assertTrue(isGoodParty);
	}

	@Test
	public void Sixty_cigars_is_a_good_party_on_weekend() {
		boolean isGoodParty = cigarParty.haveParty(60, true);
		Assert.assertTrue(isGoodParty);
	}

	@Test
	public void Thirtynine_cigars_is_not_a_good_party() {
		boolean isGoodParty = cigarParty.haveParty(39, true);
		Assert.assertFalse(isGoodParty);
	}
	
	@Test
	public void Zero__cigars_is_not_a_good_party() {
		boolean isGoodParty = cigarParty.haveParty(0, false);
		Assert.assertFalse(isGoodParty);
	}
	
	@Test
	public void Negative_100_cigars_is_not_a_good_party() {
		boolean isGoodParty = cigarParty.haveParty(-100, true);
		Assert.assertFalse(isGoodParty);
	}

	@Test
	public void Sixty1_cigars_is_not_a_good_party_on_a_weekday() {
		boolean isGoodParty = cigarParty.haveParty(61, false);
		Assert.assertFalse(isGoodParty);
	}
	
	@Test
	public void Sixty1_cigars_is_a_good_party_on_a_weekend() {
		boolean isGoodParty = cigarParty.haveParty(61, true);
		Assert.assertTrue(isGoodParty);
	}
	
	@Test
	public void Largest_integer_cigars_is_a_good_party_on_a_weekend() {
		boolean isGoodParty = cigarParty.haveParty(Integer.MAX_VALUE, true);
		Assert.assertTrue(isGoodParty);
	}
}
