package edu.unca.csci201;

public class Knight extends ChessPiece {

    public Knight(int color) {
	super(color);
	this.abbreviation = 'N';    

    }

    public Knight(int color, String position) {
	super(color, position);
	this.abbreviation = 'N';
    }

    @Override
    public boolean validMove(String code) {
	int col = code.charAt(0) - 'a';
	int rowChar = code.charAt(1) - '0';
	int row = 8 - rowChar;
	return row <=7 && row >= 0 && col <=7 && col >= 0;
    }

}
