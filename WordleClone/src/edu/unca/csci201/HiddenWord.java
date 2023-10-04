package edu.unca.csci201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HiddenWord {
    String hiddenword;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String[] letterColors = new String[26];

    final String GREEN_BACKGROUND = "\u001B[42m";
    final String YELLOW_BACKGROUND = "\u001b[43m";
    final String BLACK_BACKGROUND = "\u001b[40m";
    final String BACKGROUND_RESET = "\u001b[0m";

    public HiddenWord(String word) {
	this.hiddenword = word.toUpperCase();
	for (int i = 0; i < alphabet.length(); i++) {
	    letterColors[i] = BACKGROUND_RESET + "";
	}
    }

    public String evaluateGuess(String guess) {
	String formattedText = "";
	String evaluation = "";

	for (int i = 0; i < guess.length(); i++) {
	    String guessLocation = guess.substring(i, i + 1);
	    String hiddenLocation = hiddenword.substring(i, i + 1);
	    int alphabetLocation = alphabet.indexOf(guessLocation);

	    if (hiddenLocation.equals(guessLocation)) {
		formattedText = formattedText + GREEN_BACKGROUND + guessLocation;
		letterColors[alphabetLocation] = GREEN_BACKGROUND + "";
		evaluation = evaluation + "G";

	    } else if (hiddenword.indexOf(guessLocation) != (-1)) {
		formattedText = formattedText + YELLOW_BACKGROUND + guessLocation;
		letterColors[alphabetLocation] = YELLOW_BACKGROUND + "";
		evaluation = evaluation + "Y";

	    } else {
		formattedText = formattedText + BLACK_BACKGROUND + guessLocation;
		letterColors[alphabetLocation] = BLACK_BACKGROUND + "";
		evaluation = evaluation + "_";
	    }

	}

	formattedText = formattedText + BACKGROUND_RESET;
	System.out.println(formattedText);

	if (!evaluation.equals("GGGGG")) {
	    for (int i = 0; i < alphabet.length(); i++) {
		System.out.print(letterColors[i] + alphabet.substring(i, i + 1));
	    }
	    System.out.println(BACKGROUND_RESET);

	}
	return evaluation;
    }

    public String toString() {
	return "HiddenWord: " + hiddenword;
    }

}
