/* <CSCI 201 >
<09/10/23>
<Beth Powell>
*/


package edu.unca.csci201;

import java.util.ArrayList;
import java.util.List;

//Updates Box, contains main method

public class BoxTest {

	public static void main (String[] args) {
	
//		Declare and instantiate some boxes
		
		Box boxyBrown = new Box(9, 9, 9),
			beckyBox = new Box(1, 2, 3),
			rickyRectangle = new Box(0, 2, 3);
		
//		Create a list to store our boxes
		List<Box> boxes = new ArrayList<Box>();
		
//		Add our boxes to our box list
		boxes.add(boxyBrown);
		boxes.add(beckyBox);
		boxes.add(rickyRectangle);
		
//		Iterate over our list of boxes and call their toString
		boxes.forEach(box -> System.out.println(box.toString()));
		
//		Sets boxyBrown to full
		boxyBrown.setIsFull(true);
		
		System.out.println(boxyBrown);
		
		boxyBrown.setIsFull(false);
		
		System.out.println(boxyBrown);
		
		
	
	}
}
