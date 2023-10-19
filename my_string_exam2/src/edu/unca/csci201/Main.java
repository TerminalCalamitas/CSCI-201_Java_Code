package edu.unca.csci201;

public class Main {

	public static void main(String[] args) {
		MyString s1 = new MyString("Computer");
		System.out.println(s1);//Computer
		s1.replace('p', 'm');
		System.out.println(s1);//Commuter
		System.out.println(s1.indexOf('m'));//2
		System.out.println(s1.indexOf('p'));//-1
	}
}
