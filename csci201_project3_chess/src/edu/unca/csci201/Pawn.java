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
	return false;
    }

}
