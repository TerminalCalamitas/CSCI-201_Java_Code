package edu.unca.csci201;

import java.util.Random;

public class RandomMethod {

    public static void main(String[] args) {
	// Printing the result of calling the method 5 times
	System.out.println(random100());
	System.out.println(random100());
	System.out.println(random100());
	System.out.println(random100());
	System.out.println(random100());
    }
    
    public static Integer random100() {

	Random rand = new Random();
	return rand.nextInt(100) + 1;
    }

}
