package edu.unca.csci201;

public class ReverseArray {

    public static void main(String[] args) {
	String[] names = {"Frank", "Bruce", "Anna", "Abbagail"};
	
	for (int i = names.length-1; i >= 0; i--) {
	    System.out.println(names[i]);
	}
    }

}
