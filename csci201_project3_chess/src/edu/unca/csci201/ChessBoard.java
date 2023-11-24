package edu.unca.csci201;

public class ChessBoard {
	private ChessPiece[][] board;
	
	public ChessBoard() {
		board = new ChessPiece[8][8];
	}
	
	public void place(ChessPiece piece, String code) {
	    int column = code.charAt(0) - 'a';
	    int rowChar = code.charAt(1) - '0';
	    int row = 8 - rowChar;
	    piece.setPosition(code);
	    
	    board[row][column] = piece;
	}
	
	// returns the captured ChessPiece or null
	public ChessPiece move(String codeStart, String codeEnd) throws IllegalMoveException {
	    if (!validateCode(codeStart) || !validateCode(codeEnd)) {
		throw new IllegalMoveException("ERROR: illegal move attempted");
	    }
	    
	    int colStart = codeStart.charAt(0) - 'a';
	    int rowCharStart = codeStart.charAt(1) - '0';
	    int rowStart = 8 - rowCharStart;
	    
	    int colEnd = codeEnd.charAt(0) - 'a';
	    int rowCharEnd = codeEnd.charAt(1) - '0';
	    int rowEnd = 8 - rowCharEnd;

	    ChessPiece capturedPiece = board[rowEnd][colEnd];
	    
	    board[rowStart][colStart].setPosition(codeEnd);
	    board[rowEnd][colEnd] = board[rowStart][colStart];
	    board[rowStart][colStart] = null;
	    
	    return capturedPiece;
	}
	
	private boolean validateCode(String code) {
	    int col = code.charAt(0) - 'a';
	    int rowChar = code.charAt(1) - '0';
	    int row = 8 - rowChar;
	    
	    if (col > 7 || col < 0 || row > 7 || row < 0) {
		return false;
	    }
	    
	    ChessPiece capturedPiece = board[row][col];
	    return capturedPiece == null || capturedPiece.validMove(code);
	}
			
	public String toString() {
		String out="    ";
		for (char c='a'; c<='h'; c++) {
			out+=c+"    ";
		}
		out+="\n ";
		
		for (int k=0; k<41; k++) {
			out+="-";
		}
		out+="\n";

		for (int i=0; i<board.length; i++) {
			out+=(8-i)+" | ";
			for (int j=0; j<board[i].length; j++) {
				ChessPiece piece = board[i][j];
				if (piece==null) {
					out+="  ";
				} else {
					out+=piece;
				}
				out+=" | ";
			}
			out+="\n ";
			for (int k=0; k<41; k++) {
				out+="-";
			}
			out+="\n";
		}
		return out;
	}
}
