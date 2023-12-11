package edu.unca.csci201;

import org.w3c.dom.html.HTMLAnchorElement;

public class Text {
    Letter[] letters;

    public Text(String text) {
	letters = new Letter[text.length()];
	for (int i = 0; i < text.length(); i++) {
	    letters[i] = new Letter(text.charAt(i));
	}
    }

    public void setBold(int startIndex, int endIndex) {
	for (int i = startIndex; i <= endIndex; i++) {
	    letters[i].setBold();
	}
    }

    public void setItalics(int startIndex, int endIndex) {
	for (int i = startIndex; i <= endIndex; i++) {
	    letters[i].setItalics();
	}
    }

    public void concat(Text other) {
	Letter[] newText = new Letter[this.letters.length + other.letters.length];

	for (int i = 0; i < this.letters.length; i++) {
	    newText[i] = this.letters[i];
	}
	for (int i = 0; i < other.letters.length; i++) {
	    newText[i + this.letters.length] = other.letters[i];
	}

	this.letters = newText;
    }

    public void printHTML() {
	String HTMLstring = "";
	boolean currentlyBold = false;
	boolean currentlyItalics = false;

	for (int i = 0; i < letters.length; i++) {
	    // Bold logic
	    if (letters[i].isBold()) {
		if (!currentlyBold) {
		    currentlyBold = true;
		    HTMLstring += "<b>";
		}
	    } else if (currentlyBold) {
		currentlyBold = false;
		HTMLstring += "</b>";
	    }

	    // italics logic
	    if (letters[i].isItalics()) {
		if (!currentlyItalics) {
		    currentlyItalics = true;
		    HTMLstring += "<i>";
		}
	    } else if (currentlyItalics) {
		currentlyItalics = false;
		HTMLstring += "</i>";
	    }

	    // Adding the character
	    HTMLstring += letters[i].getChar();
	}

	// closing logic if last character is bold/italics
	if (letters[letters.length - 1].isBold()) {
	    HTMLstring += "</b>";
	}
	if (letters[letters.length - 1].isItalics()) {
	    HTMLstring += "</i>";
	}
	
	System.out.println(HTMLstring);
    }
}
