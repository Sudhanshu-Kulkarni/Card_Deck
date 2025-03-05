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

	// Method to print all cards in the deck
	public void printDeck() {
		for (Card card : deck ) {
			card.printCard();
		}
	}

	// Method to shuffle the deck
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	// Method to find and print a particular card
	public void findCard(String rank, String suit) {
		for (Card card : deck) {
			if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
				System.out.println("Card found: " + card);
				return;
			}
		}
		System.out.println("Card not found.");
	}

	// Method to compare two cards based on rank
	public void compareCard(Card c1, Card c2) {
		if (c1.getRank().equalsIgnoreCase(c2.getRank())) {
			System.out.println("Both cards have the same rank: " + c1.getRank());
		} else {
			System.out.println("Cards have different ranks: " + c1 + " vs " + c2);
		}
	}

}
