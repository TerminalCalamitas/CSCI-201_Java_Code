package edu.unca.csci201;

import java.util.Scanner;

public class LargerNumber {

    public static void main(String[] args) {
	// Initializing scanner
	Scanner scan = new Scanner(System.in);
	// Getting all numbers as int values
	System.out.print("Enter the first number: ");
	double num1 = scan.nextDouble();
	System.out.print("Enter the second number: ");
	double num2 = scan.nextDouble();

	if (larger(num1, num2)) {
	    System.out.println(num1 + " is larger than " + num2);
	} else {
	    System.out.println(num1 + " is not larger than " + num2);
	}

    }
    
    public static boolean larger(double number1, double number2) {
	return number1 > number2;
    }

}
