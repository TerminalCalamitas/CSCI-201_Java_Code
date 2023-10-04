package edu.unca.csci201;

public class PowersOfTwo {

    public static void main(String[] args) {
	powersOfTwo();

    }
    
    public static void powersOfTwo() {
	int two = 2;
	for (int i = 1; i < 11; i++) {
	    double power = Math.pow(two, i);
	    System.out.println("2 ^ " + i + " = " + power);
	}
    }

}
