package edu.unca.csci201;

import java.io.*;
import java.util.Scanner;

public class WordList {

    String[] wordlist;

    public WordList() throws IOException {
	loadList();
    }

    public int size() {
	return this.wordlist.length;
    }

    public String getWord(int index) {
	return this.wordlist[index];
    }

    public boolean inList(String word) {
	boolean present = false;
	
	for (int i= 0; i < this.wordlist.length; i++) {
	    if (word == this.wordlist[i]) {
		present = true;
	    }
	}
	
	return present;
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
