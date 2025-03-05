// Deck.java

import java.util.*;

public class Deck {
	private ArrayList<Card> deck;

	// Constructor to create and initialize the deck
	public Deck() {
		deck = new ArrayList<>();
		createDeck();
	}

	// Method to create a deck of 52 cards
	private void createDeck() {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(new Card(rank, suit));
			}
		}
	}

}
