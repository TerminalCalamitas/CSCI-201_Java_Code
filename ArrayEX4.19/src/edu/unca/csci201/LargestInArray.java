package edu.unca.csci201;

import java.util.Random;

public class LargestInArray {

    public static void main(String[] args) {
	int[] intArray = new int[10];
	Random rand = new Random();
	int largestInt = Integer.MIN_VALUE;

	for (int i = 0; i < intArray.length; i++) {
	    int randInt = rand.nextInt(-255, 255);
	    intArray[i] = randInt;
	}

	for (int i = 0; i < intArray.length; i++) {
	    if (intArray[i] > largestInt) {
		largestInt = intArray[i];
	    }
	}

	System.out.println("The largest number was " + largestInt);
    }

}
