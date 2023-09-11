package edu.unca.csci201;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
	// Initializing scanner
	Scanner scan = new Scanner(System.in);
	// Getting numbers as int values
	System.out.print("Enter the first integer: ");
	int num1 = scan.nextInt();
	System.out.print("Enter the second integer: ");
	int num2 = scan.nextInt();
	
	double average = average(num1, num2);
	System.out.println("The average of " + num1 + ", and " + num2 + " is: " + average);

    }
    
    public static double average(int num1, int num2) {
	// Sum is a double so that average can store decimal points
	double sum = num1 + num2;
	// Average calculation
	double average = sum / 2;
	return average;
    }

}

