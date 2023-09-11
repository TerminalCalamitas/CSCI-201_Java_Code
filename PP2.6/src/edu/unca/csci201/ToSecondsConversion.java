package edu.unca.csci201;

import java.util.Scanner;

public class ToSecondsConversion {

    public static void main(String[] args) {
	// Initializing scanner
	Scanner scan = new Scanner(System.in);
	// Getting all units as int values since double doesn't make sense
	System.out.print("Enter the number of hours: ");
	int Hours = scan.nextInt();
	System.out.print("Enter the number of minutes: ");
	int Minutes = scan.nextInt();
	System.out.print("Enter the number of seconds: ");
	int Seconds = scan.nextInt();

	// Doing calculations to convert down
	Minutes += Hours * 60;

	// Storing as new variable to keep old variable value
	int totalSeconds = (Minutes * 60) + Seconds;

	// Printing results

	System.out.println("There are " + totalSeconds + " seconds in " + Hours + " hours, " + Minutes
		+ " minutes, and " + Seconds + " seconds.");

    }

}
