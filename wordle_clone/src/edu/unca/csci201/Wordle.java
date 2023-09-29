package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
	// what instance variables do I need?
	private String hiddenWord;
	private boolean win;//true if the user guessed the word
	private Scanner scan;
	
	//constructor
	public Wordle( ) {
		// generate a random word from a short list
		Random r = new Random();
		int randomIndex = r.nextInt(3);
		switch (randomIndex) {
			case 0:
				hiddenWord="HELLO";
				break;
			case 1:
				hiddenWord="WRONG";
				break;
			case 2:
				hiddenWord="EXERT";
				break;
		}
		//System.out.println("hidden word is "+hiddenWord);
		
		win=false;
		scan = new Scanner(System.in);
	}
	
	//instance methods
	private void takeTurn( ) {
		String guess = getGuess();
		String code = evaluateGuess(guess);
		System.out.println(code);
		if (code.equals("GGGGG")) {
			win=true;
			System.out.println("You win!");
		}
	}
	
	
	public void play( ) {
		takeTurn();
		if (!win) {
			takeTurn();
		}
		if (!win) {
			takeTurn();
		}
		if (!win) {
			takeTurn();
		}
		if (!win) {
			takeTurn();
		}
		if (!win) {
			takeTurn();
		}
	}
	
	private String getGuess() {
		System.out.println("Enter your guess:");
		String guess = scan.nextLine();
		//TODO: verify guess is properly formatted
		return guess;
	}
	
	private String evaluateGuess(String guess) {
		//System.out.println("hidden word: "+hiddenWord);
		//System.out.println("guess: "+guess);
		
		String code="";
		// build the code character by character
		code+=evaluateNthLetter(guess,0);
		code+=evaluateNthLetter(guess,1);
		code+=evaluateNthLetter(guess,2);
		code+=evaluateNthLetter(guess,3);
		code+=evaluateNthLetter(guess,4);
		
		return code;
	}

	private String evaluateNthLetter(String guess, int n) {
		String guessCharN = guess.substring(n,n+1);
		//System.out.println("evaluating "+guessCharN);
		// see if the letter is in the correct position
		if (guessCharN.equals(hiddenWord.substring(n,n+1))) {
			return "G";
		}
		// see if the letter is anywhere in the hidden word
		if (hiddenWord.indexOf(guessCharN)!=-1) {
			return "Y";
		}
		return "_";
	}
	
}
