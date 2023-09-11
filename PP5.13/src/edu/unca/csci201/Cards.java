package edu.unca.csci201;

import java.util.Random;

public class Cards {

	
	

	
		
		int faceValue;
		int suit;
			
		Random random = new Random();
		
		public Cards() {
			 faceValue = random.nextInt(13)+1;
			 suit = random.nextInt(4)+1;
		}
		
		public String displayCard() {
			String cardReadout = "";
			
			cardReadout += "Suit : ";    //Reads the Suit
			
			if( suit == 1) {
				cardReadout += "Hearts ";
			} else if(suit == 2) {
				cardReadout += "Diamonds ";
			} else if(suit == 3) {
				cardReadout += "Spades ";
			} else {
				cardReadout += "Clubs ";
			}
			
			cardReadout += ", Face value : ";      //Reads face value 
			
			if(faceValue == 1 ) {
				cardReadout += "Ace";
			} else if(faceValue == 11) {
				cardReadout += "Jack";
			} else if(faceValue==12) {
				cardReadout += "Queen";
			} else if(faceValue==13) {
				cardReadout += "King";
			} else {
				cardReadout += faceValue;
			}
			 
			return cardReadout;
		}
		

	


	public static void main(String[] args) {
		
		final Cards card1 = new Cards();
		final Cards card2 = new Cards();
		final Cards card3 = new Cards();
		final Cards card4 = new Cards();
		final Cards card5 = new Cards();
		
		System.out.println(card1.displayCard());
		System.out.println(card2.displayCard());
		System.out.println(card3.displayCard());
		System.out.println(card4.displayCard());
		System.out.println(card5.displayCard());
	}
}
	

