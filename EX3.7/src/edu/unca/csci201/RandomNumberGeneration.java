package edu.unca.csci201;

import java.util.Random;

public class RandomNumberGeneration {

    public static void main(String[] args) {
	// Initializing random number generator
	Random rand = new Random();

	// Assigning random number variable
	int randNum;

	// a. 0 to 10
	randNum = rand.nextInt(11);
	System.out.println("Number from 0 to 10: " + randNum);

	// b. 0 to 500
	randNum = rand.nextInt(501);
	System.out.println("Number from 0 to 500: " + randNum);

	// c. 1 to 10
	randNum = rand.nextInt(10) + 1;
	System.out.println("Number from 1 to 10: " + randNum);

	// d. 1 to 500
	randNum = rand.nextInt(500) + 1;
	System.out.println("Number from 1 to 500: " + randNum);

	// e. 25 to 50
	randNum = rand.nextInt(26) + 25;
	System.out.println("Number from 25 to 50: " + randNum);

	// f. -10 to 15
	randNum = rand.nextInt(26) - 10;
	System.out.println("Number from -10 to 15: " + randNum);
    }

}
