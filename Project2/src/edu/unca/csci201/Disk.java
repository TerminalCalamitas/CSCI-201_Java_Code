package edu.unca.csci201;

public class Disk {
    char color;

    public Disk(char letter) {
	// Simply converting to uppercase then assigning the color
	char upperLetter = Character.toUpperCase(letter);
	color = upperLetter;
    }

    // Required code I never used
    public boolean isRed() {
	return color == 'R';
    }
    public boolean isBlack() {
	return color == 'B';
    }
}
