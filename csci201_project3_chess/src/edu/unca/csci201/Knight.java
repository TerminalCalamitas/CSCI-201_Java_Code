package edu.unca.csci201;

public class Knight extends ChessPiece {

    public Knight(int color) {
	super(color);
	this.abbreviation = 'P';    

    }

    public Knight(int color, String position) {
	super(color, position);
	this.abbreviation = 'P';
    }

    @Override
    public boolean validMove(String code) {
	// TODO Auto-generated method stub
	return false;
    }

}
