package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class Wordle {

    public Wordle() {
	// TODO Auto-generated constructor stub
    }
    
    public void play() {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	int intIndex;
	
	System.out.print("Welcome to my Wordle Clone!\n"
		+ "Press enter to play with a random word,\n"
		+ "or enter a nonnegative integer to pick that word from the list:");
	String stringIndex = scan.nextLine();
	
	if(stringIndex == "") {
	    intIndex = rand.nextInt(999);
	} else {
	    intIndex = Integer.parseInt(stringIndex);
	}
	
	System.out.println(intIndex);
    }

}
