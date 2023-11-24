package edu.unca.csci201;

public class Pawn extends ChessPiece {

    public Pawn(int color) {
	super(color);
	this.abbreviation = 'P';
    }

    public Pawn(int color, String position) {
	super(color, position);
	this.abbreviation = 'P';
    }

    @Override
    public boolean validMove(String code) {
	int col = code.charAt(0) - 'a';
	int rowChar = code.charAt(1) - '0';
	int row = 8 - rowChar;
	return row <=7 && row >= 0 && col <=7 && col >= 0;
    }

}
