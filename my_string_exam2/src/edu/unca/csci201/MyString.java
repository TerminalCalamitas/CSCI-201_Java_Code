package edu.unca.csci201;


public class MyString {
    char[] charArray;
    
    public MyString(String string) {
	charArray = new char[string.length()];
	for(int i = 0; i < string.length(); i++) {
	    charArray[i] = string.charAt(i);
	}
    }
    
    public int indexOf(char c) {
	int location = -1;
	for (int i = 0; i < charArray.length; i++) {
	    if (charArray[i] == c) {
		location = i;
		break;
	    }
	}
	
	return location;
    }
    
    public void replace(char char1, char char2) {
	for (int i = 0; i < charArray.length; i++) {
	    if (charArray[i] == char1) {
		charArray[i] = char2;
	    }
	}
    }

    public String toString() {
	String toString = "";
	
	for (int i = 0; i < charArray.length; i++) {
	    toString = toString + charArray[i];
	}
	
	return toString;
    }
    
    

}
