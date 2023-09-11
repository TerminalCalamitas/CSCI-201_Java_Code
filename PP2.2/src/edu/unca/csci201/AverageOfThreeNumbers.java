package edu.unca.csci201;

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
	// Initializing scanner
	Scanner scan = new Scanner(System.in);
	// Getting all numbers as int values
	System.out.print("Enter the first integer: ");
	int num1 = scan.nextInt();
	System.out.print("Enter the second integer: ");
	int num2 = scan.nextInt();
	System.out.print("Enter the last integer: ");
	int num3 = scan.nextInt();

	// Sum is a double so that average can store decimal points
	double sum = num1 + num2 + num3;
	// Average calculation
	double average = sum / 3;
	System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

    }

}
