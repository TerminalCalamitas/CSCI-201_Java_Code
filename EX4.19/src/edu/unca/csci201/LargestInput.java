package edu.unca.csci201;

import java.util.Scanner;

public class LargestInput {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int largestInt = Integer.MIN_VALUE;

	for (int i = 0; i < 10; i++) {
	    System.out.print("Input " + (i + 1) + ": ");
	    int intInput = scan.nextInt();
	    if (intInput > largestInt) {
		largestInt = intInput;
	    }
	}

	System.out.println("The largest number was " + largestInt);
    }

}
