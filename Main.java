// Main.java

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Deck deck = new Deck();

		while(true) {
			System.out.println("\n---- Card Deck Menu ----");
			System.out.println("1. Print Deck");
			System.out.println("2. Print Card");
			System.out.println("3. Shuffle Deck");
			System.out.println("4. Find a Card");
			System.out.println("5. Compare Two Cards");
			System.out.println("6. Find Cards of the Same Suit");
			System.out.println("7. Deal 5 Cards");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();  // Consume newline

			switch (choice) {
				case 1:
					deck.printDeck();
					break;
				case 2:
    				Card firstCard = deck.getFirstCard(); // Get first card
    				firstCard.printCard(); // Print the card
    				break;


				case 3:
					deck.shuffleDeck();
					System.out.println("Deck has been shuffled!");
					break;
				case 4:
					System.out.print("Enter rank of card: ");
					String rank = scanner.next();
					System.out.print("Enter suit (Spades, Hearts, Diamonds, Clubs): ");
					String suit = scanner.next();
					deck.findCard(rank, suit);
					break;
				case 5:
					System.out.print("Enter rank of first card: ");
					String rank1 = scanner.next();
					System.out.print("Enter suit of first card: ");
					String suit1 = scanner.next();
					Card card1 = new Card(rank1, suit1);
					System.out.print("Enter rank of second card: ");
					String rank2 = scanner.next();
					System.out.print("Enter suit of second card: ");
					String suit2 = scanner.next();
					Card card2 = new Card(rank2, suit2);
					deck.compareCard(card1, card2);
					break;
				case 6:
					System.out.print("Enter suit (Spades, Hearts, Diamonds, Clubs): ");
					String findCardsBySuit = scanner.next();
					deck.findCardsBySuit(findCardsBySuit);
					break;
				case 7:
					deck.dealCard();
					break;
				case 8:
					System.out.println("Exiting program...");
					return;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
