package edu.unca.csci201;

public class main {

    public static void main(String[] args) {
	DeckOfCards deck = new DeckOfCards(); // Creating the deck
	System.out.println(deck); // Printing initial deck state
	deck.shuffle();
	System.out.println(deck); // Printing shuffled deck
	deck.deal();
	System.out.println(deck);
	
	for (int i = 0; i < 7; i++) { // Dealing a few cards to get a notable deck size difference
	    deck.deal();
	}
	
	System.out.println("The deck size is " + deck.deckSize() + " cards"); // Printing cards left in deck 
	
    }

}
