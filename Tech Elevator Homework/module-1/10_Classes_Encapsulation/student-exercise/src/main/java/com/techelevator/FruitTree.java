package com.techelevator;

public class FruitTree {
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;

	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (numberOfPiecesToRemove > 0 && numberOfPiecesToRemove <= piecesOfFruitLeft) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
		else {
			return false;
		}
	}

}
