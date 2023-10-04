package edu.unca.csci201;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    private HiddenWord target;
    private boolean isWin;
    private WordList hiddenList;
    private WordList guessList;
    private Scanner scan = new Scanner(System.in);
    private int numTurns = 6;
    

    // variables for file names so they aren't hard coded
    final String fileName1 = "answerlist.txt";
    final String fileName2 = "wordlist.txt";

    public Wordle() throws FileNotFoundException {
	int numIndex = 0;
	hiddenList = new WordList(fileName1);
	guessList = new WordList(fileName2);

	System.out.print("Welcome to my Wordle Clone!\n" + "Press enter to play with a random word,\n"
		+ "or enter a nonnegative integer to pick that word from the list (0 - " + hiddenList.size() + "): ");

	String stringIndex = scan.nextLine();

	if (stringIndex != "") {
	    numIndex = Integer.parseInt(stringIndex);
	} else {
	    Random rand = new Random();
	    numIndex = rand.nextInt(hiddenList.size());
	}

	target = new HiddenWord(hiddenList.getWord(numIndex));

    }

    public void play() {
	int turns = 0;
	while (!isWin && turns < numTurns) {
	    playTurn(turns+1);
	    turns++;
	}
	
	if (isWin) {
	    System.out.println("Congratulations on winning!\nYou won in " + turns + " turn(s)");
	} else {
	    System.out.println("Aww, too bad the hidden word was " + target);
	}
    }

    private void playTurn(int turnNumber) {
	System.out.println("Please enter guess number " + turnNumber + ": ");
	String guess = scan.nextLine();

	while (!(guess.length() == 5 && guessList.inList(guess)) ^ guess.equals("show")) {
	    System.out.println("Invalid guess. Please try again.");
	    System.out.println("Please enter guess number " + turnNumber + ": ");
	    guess = scan.nextLine();
	    
	}
	guess = guess.toUpperCase();
	
	if (guess.equals("SHOW")) {
	    System.out.println(target);
	} else if (target.evaluateGuess(guess).equals("GGGGG")) {
	    isWin = true;
	}
    }

}
