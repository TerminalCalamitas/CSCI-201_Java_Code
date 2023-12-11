package edu.unca.csci201;

public class Letter {
    private char character;
    private boolean bold;
    private boolean italics;

    public Letter(char character) {
	this.character = character;
    }

    public Letter(String character) {
	this.character = character.charAt(0);
    }

    public char getChar() {
	return character;
    }

    public boolean isBold() {
	return bold;
    }

    public String toString() {
	return "char: " + character + ", bold: " + bold + ", italics: " + italics;
    }

    public boolean isItalics() {
	return italics;
    }

    public void setBold() {
	bold = true;
    }

    public void unsetBold() {
	bold = false;
    }

    public void setItalics() {
	italics = true;
    }

    public void unsetItalics() {
	italics = false;
    }

    public void printHTML() {
	String HTMLstring = "" + character;
	if (bold) {
	    HTMLstring = "<b>" + HTMLstring + "</b>";
	}

	if (italics) {
	    HTMLstring = "<i>" + HTMLstring + "</i>";
	}

	System.out.println(HTMLstring);
    }
}
