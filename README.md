## Card Deck

This repository allows users to perform various operations on a deck of playing cards. The program runs via a **command-line interface** and provides functionality to print, shuffle, find, and deal cards.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)

## Overview
The program allows users to interact with a standard deck of 52 playing cards. Users can print the deck, find specific cards, shuffle, compare, and deal hands.

The program consists of the following classes:
- **`Card`**: Represents an individual playing card with a **rank** and **suit**.
- **`Deck`**: Manages a collection of `Card` objects, allowing operations like shuffle and deal.
- **`Main`**: Provides the user interface for interacting with the deck via a menu-driven system.

## Features
- **Print Deck**: Displays all cards in the deck.
- **Print Card**: Prints a specific card.
- **Shuffle Deck**: Randomly rearranges the order of cards.
- **Find a Card**: Searches for a specific card by rank and suit.
- **Compare Two Cards**: Determines which of two selected cards is higher.
- **Find Cards of the Same Suit**: Displays all cards of a specified suit.
- **Deal 5 Cards**: Draws and displays 5 random cards from the deck.

## Classes and Methods

### **Card Class**
Represents a single playing card with a **rank** and **suit**.

#### **Methods**
- `public Card(String rank, String suit)`: Constructor to initialize a card.
- `public String getRank()`: Returns the rank of the card.
- `public String getSuit()`: Returns the suit of the card.
- `public void printCard()`: Prints the details of the card (rank and suit).
- `@Override public String toString()`: Returns a string representation of the card.

### **Deck Class**
Handles operations related to a deck of cards.

## Methods

- **`public Card getFirstCard()`**  
  Shuffles the deck and returns the first card after shuffling.  

- **`public void printDeck()`**  
  Prints all the cards in the deck.  

- **`public void shuffleDeck()`**  
  Shuffles the deck of cards randomly.  

- **`public void findCard(String rank, String suit)`**  
  Searches for a specific card in the deck by rank and suit. Prints the card if found; otherwise, prints "Card not found."  

- **`public void compareCard(Card c1, Card c2)`**  
  Compares two cards based on their rank and prints whether they have the same rank or not.  

- **`public void findCardsBySuit(String suit)`**  
  Finds and prints all cards in the deck with the specified suit.  

- **`public void dealCard()`**  
  Deals 5 random cards from the deck and displays them. If there are fewer than 5 cards left, prints "Not enough cards."  


### **Main Class**
Provides the menu-driven interface for user interaction.

#### **Workflow**
1. Displays a menu with different options.
2. Accepts user input and performs the corresponding action.
3. Continues execution until the user exits.

## **How to Run**
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Sudhanshu-Kulkarni/Card_Deck.git
   ```
2. **Compile the Java files**:
   ```bash
   javac Main.java Deck.java Card.java
   ```
3. **Run the program**:
   ```bash
   java Main
   ```

