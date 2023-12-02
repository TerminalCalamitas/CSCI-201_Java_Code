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
	int[] currPos = parseCode(position);
	int[] relCoords = findRelCoords(code);
	int[] nextSpace = { currPos[0] + 1, currPos[1] };
	if (board.getPiece(code) != null) {
	    return false;
	}

	if (relCoords[0] == 0) {
	    // white moves up
	    if (this.isWhite()) {
		if (this.notMoved()) { // can move 2 spaces if not moved
		    return relCoords[1] == 1 || (relCoords[1] == 2 && board.getPiece(nextSpace) == null);
		}
		return relCoords[1] == 1;
	    } else {
		// black moves down
		if (this.notMoved()) {
		    return relCoords[1] == -1 || (relCoords[1] == -2 && board.getPiece(nextSpace) == null);
		}
		return relCoords[1] == -1;
	    }
	} else if (Math.abs(relCoords[0]) == 1) {
	    if (this.isWhite()) {
		return relCoords[1] == 1 && board.getPiece(relCoords) != null && !board.getPiece(relCoords).isWhite();
	    } else {
		return relCoords[1] == -1 && board.getPiece(relCoords) != null && board.getPiece(relCoords).isWhite();
	    }
	} else {
	    // pawns can't move sideways
	    return false;
	}
    }

}
