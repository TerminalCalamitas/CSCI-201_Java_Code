package edu.unca.csci201;

public class Kennel {

    public static void main(String[] args) {
	Dog dog1 = new Dog(32, "Spot");
	Dog dog2 = new Dog(12, "Darryl");
	Dog dog3 = new Dog(5, "Oreo");
	
	System.out.println("Old dog information");
	System.out.println(dog1);
	System.out.println(dog2);
	System.out.println(dog3);
	System.out.println("--------------------");
	
	// dog2's name is a bit weird
	dog2.setName("Ace");
	
	// 32 seems like an unrealistic age
	dog1.setAge(3.2);
	
	// getting dog3's name and age in people years
	System.out.println(dog3.getName() + " is " + dog3.getDogAge() + " in people years.");
	System.out.println("--------------------");
	
	// using toString method
	System.out.println("New dog information");
	System.out.println(dog1);
	System.out.println(dog2);
	System.out.println(dog3);
    }

}
