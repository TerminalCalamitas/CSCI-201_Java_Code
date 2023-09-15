package edu.unca.csci201;

import java.util.Scanner;

public class PositiveIntLoop {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// Setting initial values to get into while loop
	Boolean posIntTest = false;
	
	// Loops while number isn't a positive integer
	while(!posIntTest) {
	    System.out.print("Please enter a positive integer value: ");
	    
	    // I have to assume all inputs are integers since we don't know try-catch statements
	    String guess = scan.nextLine();
	    int intGuess =  Integer.parseInt(guess);
	    
	    if(intGuess >= 0) {
		posIntTest = true;
		System.out.println("Thank you for the positive integer: " + intGuess);
	    } else {
		System.out.println("That is not positive");
	    }
	    
	}
    }

}
