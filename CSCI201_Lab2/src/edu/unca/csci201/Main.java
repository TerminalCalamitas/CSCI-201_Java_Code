package edu.unca.csci201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Lab2: demonstrate MathVector class for working with arrays and loops
 * Code by Caleb and Andrew
 */
public class Main {

    public static double[] readData(String filename) throws FileNotFoundException {
	Scanner fileScan;

	fileScan = new Scanner(new File(filename));
	// count the lines first
	int lineCount = 0;
	while (fileScan.hasNext()) {
	    fileScan.nextLine();
	    lineCount++;
	}
	double[] values = new double[lineCount];

	fileScan = new Scanner(new File(filename));

	int index = 0;
	while (fileScan.hasNext()) {
	    double number = Double.parseDouble(fileScan.nextLine());
	    values[index] = number;
	    index++;
	}

	return values;

    }

    public static void printArray(double[] array) {
	// complete this method
	for (int i = 0; i < array.length; i++) {
	    if (i != array.length - 1) {
		System.out.print(array[i] + ", ");
	    } else {
		System.out.print(array[i]);
	    }
	}
	System.out.print("\n");
    }

    public static void main(String[] args) throws FileNotFoundException {
	// read data files into arrays first
	double[] data1 = readData("file1.txt");
	double[] data2 = readData("file2.txt");
	double[] data3 = readData("file3.txt");

	printArray(data1); // 3.0, 2.0, 7.0
	printArray(data2); // 1.0, 4.4, 8.0, 3.0
	printArray(data3); // -9.0, 0.8, 5.0

	// construct MathVector objects from arrays
	MathVector v1 = new MathVector(data1);
	MathVector v2 = new MathVector(data2);
	MathVector v3 = new MathVector(data3);
	int v1Length = v1.numberOfElements();
	System.out.println("v1Length=" + v1Length);// v1Length=3
	double v2Norm2 = v2.norm2();
	System.out.println("v2.norm2(): " + v2Norm2);// v2.norm2(): 9.66229786334493
	System.out.println("v3: " + v3); // v3: [-9.0, 0.8, 5.0]

	// modifying array shouldn't affect the MathVectors!
	data3[0] = -999;
	System.out.println("v3: " + v3); // v3: [-9.0, 0.8, 5.0]

	// draw a memory diagram of the state at this point
    }

}
