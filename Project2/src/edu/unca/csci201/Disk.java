package edu.unca.csci201;

public class Disk {
    char color;

    public Disk(char letter) {
	if (Character.toUpperCase(letter) == 'R') {
	    color = 'R';
	} else if (Character.toUpperCase(letter) == 'B') {
	    color = 'B';
	}
    }
    
    public boolean isRed() {
	return color == 'R';

    }
    
    public boolean isBlack() {
	return color == 'B';
    }
}
