package edu.unca.csci201;

import java.util.Arrays;

/*
 * Class representing a mathematical vector
 * Code by Caleb and Andrew
 * 
 */
public class MathVector {
	// complete this class
    double array[];

    public MathVector(double[] array) {
	double[] tempArray = new double[array.length];
	
	for (int i = 0; i < array.length; i++) {
	    tempArray[i] = array[i];
	}
	
	this.array = tempArray;
    }
    
    public int numberOfElements() {
	return array.length;
    }
    
    public double norm2() {
	double fin = 0;
	double sum = 0;
	for (int i=0; i<array.length; i++) {
	    sum += array[i]*array[i];
	}
	fin = Math.sqrt(sum);
	return fin;
	
	
    }
    
    public String toString() {
	return Arrays.toString(array);
    }
}
