package com.techelevator.games.cards;

public class Card {
	
	private String rank;
	private String suit;
	private boolean faceUp;    // booleans default to false
	

	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}


	public String getRank() {
		return rank;
	}


	public String getSuit() {
		return suit;
	}


	public boolean isFaceUp() {
		return faceUp;
	}
	
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
	
	@Override
	public String toString() {
		if (faceUp) {
		return rank + suit;
		}
		else {
			return "##";
		}
	}
}

	
	
	


