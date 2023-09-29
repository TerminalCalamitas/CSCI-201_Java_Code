package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class Wordle {
    	private HiddenWord target;
    	private boolean isWin;

	public Wordle() {
	    System.out.print("Welcome to my Wordle Clone!\n" + "Press enter to play with a random word,\n"
				+ "or enter a nonnegative integer to pick that word from the list: ");
	}

	public void play() {
	    int turns = 0;
		while (!isWin && turns < 6) {
		    playTurn();
		    turns++;
		}
	}
	
	private void playTurn() {
		System.out.println("helo");
	}
	

}
