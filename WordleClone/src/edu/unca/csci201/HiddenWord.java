package edu.unca.csci201;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HiddenWord {
	String hiddenword;
	
	
	public HiddenWord(String word) {
	    this.hiddenword = word.toUpperCase();
	}
	
	public String evaluateGuess(String guess) {
		
	}
	
	public String toString() {
		return "HiddenWord: " +hiddenword;
	    }
	
	private void loadList() throws FileNotFoundException {
		Scanner fileScan;

		fileScan = new Scanner(new File("wordlist.txt"));
		// count the lines first
		int lineCount = 0;
		while (fileScan.hasNext()) {
		    fileScan.nextLine();
		    lineCount++;
		}
		this.wordlist = new String[lineCount];

		fileScan = new Scanner(new File("wordlist.txt"));

		int count = 0;
		while (fileScan.hasNext()) {
		    this.wordlist[count] = fileScan.nextLine();
		    count++;
		}
	    }

}
