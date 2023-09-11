package edu.unca.csci201;

/*
 * CSCI 201 Lab1
 * class to demonstrate Rectangle
 * Code by Caleb Knapp and Beth Powell
 */
public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(2,1);
		Point p2 = new Point(4,4);
		Point p3 = new Point(-1,-3);
		Point p4 = new Point(0,0);

		// create two Rectangle objects, r1 and r2
		// r1 is defined by corners p1 and p2
		// r2 is defined by corners p3 and p4
		// create r1 here
		Rectangle r1 = new Rectangle(p1, p2);
		// create r2 here
		Rectangle r2 = new Rectangle(p3, p4);
		
		// after creating the two Rectangle objects,
		// draw a complete memory diagram
		
		// then update the memory diagram for the code execution below
		// for brevity, do not put simple getters on the stack,
		// and do not put any Math. methods or println methods on the stack 
		if (r1.isLarger(r2)) {
			System.out.println("r1 is larger");
		} else {
			System.out.println("r1 is not larger");
		}
	}

}
