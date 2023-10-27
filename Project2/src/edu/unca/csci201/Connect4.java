package edu.unca.csci201;

public class Connect4 {

    public static void main(String[] args) {
	play();
	//TODO Welcome messages
    }
    
    
    public static void play() {
	//TODO turns
	Board board = new Board();
	System.out.println(board);
	board.insert(new Disk('R'), 1);
	board.insert(new Disk('B'), 0);
	board.insert(new Disk('R'), 1);
	board.insert(new Disk('B'), 6);
	System.out.println(board);
    }
    
    private static void redTurn() {
	//TODO Red turn
    }
    
    private static void blackTurn() {
	//TODO Black turn
    }
    
    private static void checkForWin() {
	
    }
}
