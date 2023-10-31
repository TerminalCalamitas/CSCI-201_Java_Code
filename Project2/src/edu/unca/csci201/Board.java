package edu.unca.csci201;

public class Board {
    private int width = 7;
    private int height = 6;
    Column[] board = new Column[width];

    public Board() {
	// Making a new column for the width of the board
	for (int i = 0; i < width; i++) {
	    board[i] = new Column();
	}
    }

    public boolean insert(Disk disk, int columnIndex) {
	// If the board is not full insert a disk
	if (board[columnIndex].full()) {
	    return false;
	} else {
	    board[columnIndex].insert(disk);
	    return true;
	}
    }

    public String toString() {
	// board printing logic
	String rtnStr = "";
	// Loops backwards since 0 is bottom of column
	for (int i = height - 1; i >= 0; i--) {
	    rtnStr += "\n|";
	    for (int j = 0; j < width; j++) {
		if (board[j].get(i) == null) {
		    rtnStr += "   |";
		} else {
		    rtnStr += " " + board[j].get(i).color + " |";
		}
	    }
	}
	// Returns the board plus the bottom as one string
	return rtnStr += "\n-----------------------------";
    }

}
