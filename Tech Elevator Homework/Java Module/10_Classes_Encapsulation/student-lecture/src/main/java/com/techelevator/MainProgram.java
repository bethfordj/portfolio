package com.techelevator;

import com.techelevator.games.cards.Card;
import com.techelevator.games.cards.Deck;


public class MainProgram {
	
	public static void main(String[] args) {
		
		
		Deck deck = new Deck();
		
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		
		Card oneCard = deck.deal();
		oneCard.flip();
		System.out.println(oneCard);
		
		Card toReplace = deck.deal();
		toReplace.flip();
		System.out.println(toReplace);
		toReplace.flip();
		deck.placeCardBottonDeck(toReplace);
		System.out.println(deck);
		
		
		Card aceOfSpades = new Card("s", "A");
		
		System.out.println(aceOfSpades);
		
		aceOfSpades.flip();
		
		System.out.println(aceOfSpades);
		
		Card twoOfHearts = new Card("h", "2");
		twoOfHearts.flip();
		System.out.println(twoOfHearts);
		
		Deck deckOfCards = new Deck();
		
		System.out.println(deckOfCards);
		
		deckOfCards.shuffle();
		
		System.out.println(deckOfCards);
		
		Card topCard = deckOfCards.deal();
		topCard.flip();
		
		System.out.println(topCard);
		
		System.out.println(deckOfCards);
	}
	



}
