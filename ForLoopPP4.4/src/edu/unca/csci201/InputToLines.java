package edu.unca.csci201;

import java.util.Scanner;

public class InputToLines {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a word to print by characters: ");
	String input = scan.nextLine();

	// Loops through characters and prints them
	int i = 0;
	while (i < input.length()) {
	    System.out.println(input.substring(i, i + 1));
	    i++;
	}

    }

}
