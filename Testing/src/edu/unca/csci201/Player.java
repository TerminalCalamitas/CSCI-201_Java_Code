package edu.unca.csci201;

public class Player {
    // instance variable
    private String name;
    private String position;
    private int heightInInches;
    
    public Player(String name, String position, int height) {
	// TODO Auto-generated constructor stub
	this.name = name;
	this.position = position;
	this.heightInInches = height;
    }
    
    public String toString() {
	return "Player: " + name + ", " + position + ", height= " + heightInInches;
    }
}
