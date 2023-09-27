package edu.unca.csci201;

import java.util.Scanner;
import java.io.*;

public class WordList {
	String	WordList[];
	
	public WordList() throws IOException {
		String word;
		Scanner fileScan = new Scanner(new File("answerlist.txt"));
		
	}
	
	public int size() throws IOException {
		return 1;
	}
	
	public String getWord(int index)  throws IOException {
		
		
		return "hello";	
	}
	
	public boolean inList(String word)  throws IOException {
		 return true;
	}

}
