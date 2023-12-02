package edu.unca.csci201;

public abstract class ChessPiece {
    public static final int WHITE = 0;
    public static final int BLACK = 1;

    int color; // 0 for white, 1 for black as seen above
    char abbreviation; // e.g. 'P' for Pawn, 'N' for Knight, 'B' for Bishop.
    ChessBoard board;
    String position; // e.g. "c5", or "g1", etc.
    private String originalPos;

    protected ChessPiece(int color) {
	this.color = color;
	this.position = null;
	originalPos = null;
    }

    protected ChessPiece(int color, String position) {
	this.color = color;
	this.position = position;
	originalPos = position;
    }

    public void setBoard(ChessBoard b) {
	board = b;
    }

    public void setPosition(String code) {
	position = code;
    }

    public String getPosition() {
	return position;
    }

    public void setOriginalPos(String code) {
	originalPos = code;
    }

    public boolean notMoved() {
	return position.equals(originalPos);
    }

    public abstract boolean validMove(String code);

    public boolean isWhite() {
	return color == WHITE;
    }
    
    public int[] parseCode(String code) {
	int col = code.charAt(0) - 'a';
	int rowChar = code.charAt(1) - '0';
	int row = 8 - rowChar;

	int[] numList = { col, row };
	return numList;
    }

    public int[] findRelCoords(String code) {
	int[] currPos = parseCode(position);
	int[] movePos = parseCode(code);
	
	// horizontal distance
	int colDist = currPos[0] - movePos[0];
	// vertical distance
	int rowDist = currPos[1] - movePos[1];

	int[] relCoords = { colDist, rowDist };
	return relCoords;
    }

    public String toString() {
	return (color == WHITE ? "W" : "B") + abbreviation;
    }
}
