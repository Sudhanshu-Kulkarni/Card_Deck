// Card.java

public class Card {
	private String rank;
	private String suit;

	// Constructor
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	// Method to print a single card
	public void printCard() {
		System.out.println(this);
	}

	// Getter methods for rank and suit
	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}
}
