package edu.unca.csci201;

public class Bishop extends ChessPiece {

    public Bishop(int color) {
	super(color);
	this.abbreviation = 'B';
    }

    public Bishop(int color, String position) {
	super(color, position);
	this.abbreviation = 'B';
    }

    public boolean validMove(String code) {
	int[] coords = parseCode(position);
	int[] relCoords = findRelCoords(code);
	int[] finalCoords = parseCode(code);

	// first check location is on diagonal
	if (Math.abs(relCoords[0]) == Math.abs(relCoords[1])) {
	    // getting if the numbers are positive or negative for later
	    int ysign = relCoords[0] / Math.abs(relCoords[0]);
	    int xsign = relCoords[1] / Math.abs(relCoords[1]);
	    // make sure no previous squares are a piece
	    for (int i = 1; i < relCoords[0] - 1; i++) {
		// adding the test location to the pieces location
		int[] testlocation = { coords[0] + (i * ysign), coords[1] + (i * xsign) };
		if (board.getPiece(testlocation) != null) {
		    return false;
		}
	    }
	    // return whether the piece is the opposite color or not
	    return this.isWhite() != board.getPiece(finalCoords).isWhite();

	} else {
	    return false;
	}

    }

}
