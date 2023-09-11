package edu.unca.csci201;

import java.util.Scanner;

public class MilesToKilometers {

    public static void main(String[] args) {
	// Set up variables
	Scanner scan = new Scanner(System.in);
	double MpKM = 1.60935;
	// Getting input
	System.out.print("Enter a number of miles to be converted: ");
	double miles = scan.nextDouble();

	// Calculating and printing results
	double KMs = miles * MpKM;
	System.out.println("There are " + KMs + " Kilometers in " + miles + " miles.");
    }

}
