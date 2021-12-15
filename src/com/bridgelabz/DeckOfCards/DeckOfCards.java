package com.bridgelabz.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;

class Card {

	String suit;
	String rank;

	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card -> [suit=" + suit + ", rank=" + rank + "]";
	}

}

class DeckOfCard {

	String suits[] = { "club", "diamond", "heart", "spade" };
	String ranks[] = { "2", "3", "4", "5", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
	ArrayList<Card> cards;

	public DeckOfCard() {
		cards = new ArrayList<Card>();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				this.cards.add(new Card(suits[i], ranks[j]));
			}
		}
		// Shuffle after the creation
		Collections.shuffle(this.cards);

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

}

//Main class

public class DeckOfCards {

	public static void main(String[] args) {
		System.out.println("Welcome to the Deck Of Cards");

		DeckOfCard deck = new DeckOfCard();
		ArrayList<Card> cards = deck.getCards();
		// For each loop for traversing each card
		for (Card card : cards) {
			System.out.println(card);
		}

	}

}
