package edu.unca.csci201;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    int length = 52;
    Card[] deck = new Card[length];

    public DeckOfCards() {
	for (int i = 0; i < this.length; i++) {
	    deck[i] = new Card(i); // Making 52 cards

	}
    }

    public String toString() {
	return Arrays.toString(deck); // Eclipse generated toString method
    }

    public void deal() {
	int firstCard = -1;
	for (int i = 0; i < this.length; i++) { // Finding first not card index
	    if (deck[i].suit != null) {
		firstCard = i;
		break;
	    }
	}
	if ( firstCard == -1) { // incase you deal the whole deck
	    System.out.println("The whole deck is gone! I can't deal another card.");
	} else { // normal dealing
	    System.out.println("Your card is the " + deck[firstCard]);
	    deck[firstCard] = new Card(-1); // Setting the card's index to a null card
	}
    }

    public void shuffle() {
	Random rand = new Random();
	int[] indexArray = new int[52];

	for (int i = 0; i < this.length; i++) {
	    indexArray[i] = rand.nextInt(0, 52);

	    for (int j = 0; j < i; j++) {
		if (indexArray[i] == indexArray[j]) {
		    i--;
		    break;
		}
		
	    }
	    
	}

	for (int i = 0; i < this.length; i++) {
	    deck[i] = new Card(indexArray[i]);
	}

    }

    public int deckSize() {
	int count = 0;
	for (int i = 0; i < this.length; i++) {
	    if (deck[i].suit != null) {
		count++;
	    }
	}
	
	return count;

    }

}
