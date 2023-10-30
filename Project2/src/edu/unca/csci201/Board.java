package edu.unca.csci201;

public class Board {
    private int width = 7;
    private int height = 6;
    Column[] board = new Column[width];

    public Board() {
	for (int i = 0; i < width; i++) {
	    board[i] = new Column();
	}
    }
    
    public boolean insert(Disk disk, int columnIndex) {
	if (board[columnIndex].full()) {
	    return false;
	} else {
	    board[columnIndex].insert(disk);
	    return true;
	}
    }
    
    public String toString() {
	String rtnStr = "";
	for (int i = 0; i < height; i++) {
	    rtnStr += "\n|";
	    for (int j = 0; j < width; j++) {
		if (board[j].get(i) == null) {
		    rtnStr += "   |";
		} else {
		    rtnStr += " " + board[j].get(i).color + " |";
		}
	    }
	}
	
	return rtnStr += "\n-----------------------------";
    }
    

}
