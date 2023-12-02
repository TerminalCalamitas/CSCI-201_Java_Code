package edu.unca.csci201;

public class StringQueue {
    String data;

    public static void main(String[] args) {
	StringQueue q = new StringQueue();
	q.enqueue("A"); // The String A is in the queue
	q.enqueue("BB"); // A is at the front, then BB
	q.enqueue("C"); // A is at the front, then BB, then C
	System.out.println(q.count()); // 3
	String s = q.dequeue(); // returns "A", now BB is front, then C
	System.out.println(s); // prints A
	System.out.println(q.count()); // 2
	q.enqueue("D");
	q.enqueue("EEEE");
	s = q.dequeue() + q.dequeue() + q.dequeue() + q.dequeue();
	System.out.println(s); // BBCDEEEE
	System.out.println(q.count()); // 0
    }

    public void enqueue(String string) {
	// I'm using null as a 0 length queue
	if (data == null) {
	    data = string;
	} else {
	    // add delim if something already in queue
	    data += ":" + string;
	}
    }

    public String dequeue() {
	// find first occurance of the delim
	int firstDelim = data.indexOf(':');
	// initializing string to be returned
	String returnString;
	// if there is no delim there is only one item
	if (firstDelim == -1) {
	    returnString = data;
	    data = null;
	} else {
	    // get substring then set data to everything except for the substring and the delim
	    returnString = data.substring(0, firstDelim);
	    data = data.substring(firstDelim + 1, data.length());
	}
	return returnString;
    }

    public int count() {
	// there is always one item unless data is null
	int count = 1;
	if (data == null) {
	    // if data is null there is nothing
	    return 0;
	} else {
	    // simply counting the nuber of colons
	    for (int i = 0; i < data.length(); i++) {
		if (data.charAt(i) == ':') {
		    count++;
		}
	    }
	}
	return count;
    }

}
