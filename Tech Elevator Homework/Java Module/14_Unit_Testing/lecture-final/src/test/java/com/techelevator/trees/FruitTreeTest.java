package com.techelevator.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	private FruitTree fruitTree;
	
	@Before
	public void setup() {
		fruitTree = new FruitTree("Pears", 10);
	}
	
	
	@Test
	public void pick_5__successful() {
		// Arrange
		// Act
		boolean result = fruitTree.pickFruit(5);
		// Assert
		Assert.assertTrue(result);
		Assert.assertEquals(5, fruitTree.getPiecesOfFruitLeft());
	}
	
	@Test
	public void pick_fruit_then_pick_some_more_then_try_to_pick_too_many() {
		// Arrange
		fruitTree.pickFruit(5);
		fruitTree.pickFruit(3);
		
		// Act
		boolean result = fruitTree.pickFruit(3);
		Assert.assertFalse("Expected False, but was True", result);
		Assert.assertEquals("Wrong number of fruit left", 2, fruitTree.getPiecesOfFruitLeft());
		
	}
}
