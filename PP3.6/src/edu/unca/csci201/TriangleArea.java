package edu.unca.csci201;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
	// Initializing scanner
	Scanner scan = new Scanner(System.in);
	// Getting all numbers as double values
	System.out.print("Enter the first side of the triangle: ");
	double A = scan.nextDouble();
	System.out.print("Enter the second side: ");
	double B = scan.nextDouble();
	System.out.print("Enter the last side: ");
	double C = scan.nextDouble();

	double S = (A + B + C) / 2;
	double Area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

	System.out.printf("A triangle with sides %.3f %.3f and %.3f have an area of %.3f %n", A, B, C, Area);

    }

}
