package com.techelevator.games.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	// a collection of cards
	private List<Card> cards = new ArrayList<Card>();
	
	// final strings so that each is only created once;
	private final static String[] suits = new String[] {"c", "s", "d", "h"};
	private final static String [] ranks = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
	
	
	// Constructor builds a deck including initial order
	public Deck() {
		for (String suit : suits) {
			for (String rank : ranks) {
				Card currentCard = new Card(rank, suit);
				cards.add(currentCard);
			}
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card deal() {
		if (cards.size() > 0) {
		return cards.remove(0);
		}
		else {
			return null;
		}
	}
	
	public void placeCardBottonDeck(Card card) {
		cards.add(card);
	}
	// re-add card

	
	
	public int size() {
		return cards.size();
	}
	
	
	private void flipDeck() {
		for (Card playingCard : cards) {
			playingCard.flip();
		}
	}
	
	@Override
	public String toString() {
		this.flipDeck();
		String deckAsString = "Deck [cards= " + cards + "]";
		this.flipDeck();
		return deckAsString;
	}
	
}
