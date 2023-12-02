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
	int[] relCoords = findRelCoords(code);
	int[] finalCoords = parseCode(code);

	if( (Math.abs(relCoords[0]) == 1 && Math.abs(relCoords[1]) == 2)
		|| (Math.abs(relCoords[0]) == 2 && Math.abs(relCoords[1]) == 1)) {
	    
	    return this.isWhite() != board.getPiece(finalCoords).isWhite();
	    
	 } else {
	   return false;
	 }
    }

}
