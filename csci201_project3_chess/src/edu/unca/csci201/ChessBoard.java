package edu.unca.csci201;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
	board = new ChessPiece[8][8];
    }

    public void place(ChessPiece piece, String code) {
	int[] coords = parseCode(code);
	
	piece.setBoard(this);
	
	piece.setPosition(code);
	piece.setOriginalPos(code);

	board[coords[1]][coords[0]] = piece;
    }

    // returns the captured ChessPiece or null
    public ChessPiece move(String codeStart, String codeEnd) throws IllegalMoveException {
	int[] coordsStart = parseCode(codeStart);
	int[] coordsEnd = parseCode(codeEnd);
	ChessPiece movePiece = board[coordsStart[1]][coordsStart[0]];
	ChessPiece capturePiece = board[coordsEnd[1]][coordsEnd[0]];
	
	if (!validateCode(codeStart) || !validateCode(codeEnd)) {
	    throw new IllegalMoveException("ERROR: illegal move attempted");
	}

	if (!movePiece.validMove(codeEnd)) {
	    throw new IllegalMoveException("ERROR: illegal move attempted");
	}

	if (capturePiece != null && movePiece.isWhite() == capturePiece.isWhite()) {
	    throw new IllegalMoveException("ERROR: cannot capture own piece");
	}
	
	ChessPiece capturedPiece = board[coordsEnd[1]][coordsEnd[0]];
	board[coordsStart[1]][coordsStart[0]].setPosition(codeEnd);
	board[coordsEnd[1]][coordsEnd[0]] = board[coordsStart[1]][coordsStart[0]];
	board[coordsStart[1]][coordsStart[0]] = null;
	
	return capturedPiece;
    }

    private int[] parseCode(String code) {
	int col = code.charAt(0) - 'a';
	int rowChar = code.charAt(1) - '0';
	int row = 8 - rowChar;

	int[] numList = { col, row };
	return numList;
    }

    private boolean validateCode(String code) {
	int[] coords = parseCode(code);

	if (coords[0] > 7 || coords[0] < 0 || coords[1] > 7 || coords[1] < 0) {
	    return false;
	}
	return true;
    }
    
    public ChessPiece getPiece(String code) {
	int[] piece = parseCode(code);
	return board[piece[1]][piece[0]];
    }
    
    public ChessPiece getPiece(int[] piece) {
	return board[piece[1]][piece[0]];
    }

    public String toString() {
	String out = "    ";
	for (char c = 'a'; c <= 'h'; c++) {
	    out += c + "    ";
	}
	out += "\n ";

	for (int k = 0; k < 41; k++) {
	    out += "-";
	}
	out += "\n";

	for (int i = 0; i < board.length; i++) {
	    out += (8 - i) + " | ";
	    for (int j = 0; j < board[i].length; j++) {
		ChessPiece piece = board[i][j];
		if (piece == null) {
		    out += "  ";
		} else {
		    out += piece;
		}
		out += " | ";
	    }
	    out += "\n ";
	    for (int k = 0; k < 41; k++) {
		out += "-";
	    }
	    out += "\n";
	}
	return out;
    }
}
