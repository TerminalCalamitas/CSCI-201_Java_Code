package edu.unca.csci201;

public class Card {
    private  String[] values = {"Ace", "2","3","4","5","6","7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    
    String faceValue;
    String suit;

    public Card(int i) {
	if (i == -1) { // Incase I need a null card
	    suit = null;
	    faceValue = null;
	} else {
	    faceValue = values[i % 13];
	    suit = suits[i / 13];
	    
	}
    }

    public String toString() {
	return faceValue + " of " + suit;
    }

}
