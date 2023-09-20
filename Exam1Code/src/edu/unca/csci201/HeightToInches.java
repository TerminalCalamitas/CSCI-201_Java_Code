package edu.unca.csci201;

import java.util.Scanner;

public class HeightToInches {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	// initializing variables for part b
	int intInches = 0;
	int intFeet = 0;

	System.out.print("Enter length in <feet>'<inches>\" format: ");
	String formattedHeight = scan.nextLine();

	// getting the ' and " locations
	int index1 = formattedHeight.indexOf("'");
	int index2 = formattedHeight.indexOf("\"");

	// using the ' index to parse the feet in int format
	if (index1 != -1) {
	    String strFeet = formattedHeight.substring(0, index1);
	    intFeet = Integer.parseInt(strFeet);
	}
	// using the " index to get the inches
	if (index2 != -1) {
	    String strInches = formattedHeight.substring(index1 + 1, index2);
	    intInches = Integer.parseInt(strInches);
	}
	// converting to inches
	int totalInches = 12 * intFeet + intInches;
	System.out.println("Total inches is " + totalInches);

    }

}
