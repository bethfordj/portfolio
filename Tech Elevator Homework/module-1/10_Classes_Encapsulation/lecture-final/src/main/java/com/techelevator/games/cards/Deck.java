package com.techelevator.games.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Collection of Cards
	private List<Card> cards = new ArrayList<Card>();
	
	private final static String[] suits = new String[] {"c", "s", "d", "h" };
	private final static String[] ranks = new String[] { "A", "2", "3", "4", "5", "6","7","8","9", "T", "J", "Q", "K"};
	
	// When constructed build a deck
	public Deck() {
		for (String suit : suits) {
			for (String rank : ranks) {
				Card currentCard = new Card(rank, suit);
				cards.add(currentCard);
			}
		}
	}
	
	
	// shuffle
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// draw/deal
	public Card deal() {
		if (cards.size() > 0) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	// Re-add card
	public void placeCardBackInDeck(Card card) {
		cards.add(card);
	}
	
	// Delegate Method
	public int size() {
		return cards.size();
	}
	
	@Override
	public String toString() {
		this.flip();
		String deckAsString = "Deck [cards=" + cards + "]"; 
		this.flip();
		return deckAsString;
	}
	
	private void flip() {
		for (Card playingCard : cards) {
			playingCard.flip();
		}
	}
}
