package edu.unca.csci201;

public class ArraySum {

    public static void main(String[] args) {
	double[] doubleArray = { 1.2, 5.6, 9.9, 9.124, 0.123 };
	double sum = sumArray(doubleArray);
	System.out.println("The sum is: " + sum);
    }

    public static double sumArray(double[] array) {
	double sum = 0;

	for (int i = 0; i < array.length; i++) {
	    sum += array[i];
	}

	return sum;
    }

}
