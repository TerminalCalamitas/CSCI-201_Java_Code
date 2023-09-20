package edu.unca.csci201;

public class AlternatingArray {

    public static void main(String[] args) {
	boolean[] alternate = new boolean[10];
	
	for(int i = 0; i < alternate.length; i++) {
	    if(i % 2 ==0) {
		alternate[i] = true;
	    } else {
		alternate[i] = false;
	    }
	}
	
	for(int i = 0; i < alternate.length; i++) {
	    System.out.println(alternate[i]);
	}
    }

}
