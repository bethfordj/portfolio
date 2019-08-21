package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

	private CigarParty cigarParty;
	
	@Before
	public void beforeTests() {
		cigarParty = new CigarParty();
	}
	
	@Test
	public void when_50_cigars_is_a_good_party_on_the_weekend() {
		// Arrange
		
		// Act
		boolean isGoodParty = cigarParty.haveParty(50, true);
		
		// Assert
		Assert.assertTrue(isGoodParty);
	}
	
	@Test
	public void when_40_cigars_is_a_good_party_not_on_weekend() {
		// Arrange
		
		// Act
		boolean isGoodParty = cigarParty.haveParty(40, false);
		
		// Assert
		Assert.assertTrue(isGoodParty);
	}
	
	@Test
	public void when_60_cigars_is_a_good_party_on_weekend() {
		
		// Arrange
		
		// Act
		boolean isGoodParty = cigarParty.haveParty(60, true);
		
		// Assert
		Assert.assertTrue(isGoodParty);
	}
	
	@Test 
	public void when_39_cigars_is_not_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(39, true);
		//Assert
		Assert.assertFalse(isGoodParty);
	}
	
	@Test 
	public void when_0_cigars_is_not_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(0, false);
		//Assert
		Assert.assertFalse(isGoodParty);
	}
	
	@Test 
	public void when_negative_cigars_is_not_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(-100, true);
		//Assert
		Assert.assertFalse(isGoodParty);
	}
	
	@Test
	public void when_61_cigars_and_a_weekend_is_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(61, true);
		// Assert
		Assert.assertTrue(isGoodParty);
	}
	
	@Test
	public void when_61_cigars_and_not_a_weekend_is_not_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(61, false);
		// Assert
		Assert.assertFalse(isGoodParty);
	}
	
	@Test
	public void when_max_number_of_cigars_and_weekend_is_a_good_party() {
		// Arrange
		// Act
		boolean isGoodParty = cigarParty.haveParty(Integer.MAX_VALUE, true);
		// Assert
		Assert.assertTrue(isGoodParty);
	}
	
}
