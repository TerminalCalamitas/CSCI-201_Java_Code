package edu.unca.csci201;

import java.util.Scanner;

public class Connect4 {

    public static void main(String[] args) {
	play();
	// TODO Welcome messages
    }

    public static void play() {
	int turnNum = 0;
	Board board = new Board();
	
	System.out.println(board);
	
	while (true) {
	    char playerLetter = 'B';
	    
	    if (turnNum % 2 == 0) {
		playerLetter = 'R';
	    }
	    
	    if (playerTurn(board, playerLetter)) {
		
		if (playerLetter == 'R') {
		    System.out.println("Red Wins!");
		    
		} else {
		    System.out.println("Black Wins!");
		}
		
		break;
	    }
	    
	    turnNum++;
	}
	System.out.println(board);
    }

    private static boolean playerTurn(Board board, char playerLetter) {
	Scanner input = new Scanner(System.in);

	String color = "";
	if (playerLetter == 'R') {
	    color = "Red";
	} else {
	    color = "Black";
	}

	System.out.println(color + "'s turn:");
	System.out.print("Choose a column (1-7): ");
	String numString = input.nextLine();
	int index = Integer.parseInt(numString);

	while (!board.insert(new Disk(playerLetter), index - 1)) {
	    System.out.println("Invalid move, please try again.");
	    System.out.println(color + "'s turn:");
	    System.out.print("Choose a column (1-7): ");
	    index = Integer.parseInt(input.nextLine()) - 1;
	}
	System.out.println(board);
	return checkForWin(board, playerLetter, index - 1);
    }

    private static boolean checkForWin(Board board, char playerLetter, int lastIndex) {
	Column[] columns = board.board;
	int diskHeight = columns[lastIndex].height;
	
	if (horizontalCheck(columns, diskHeight, playerLetter) || verticalCheck(columns[lastIndex], playerLetter)/* || diagonalCheck(columns, playerLetter, lastIndex, diskHeight)*/) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean horizontalCheck(Column[] board, int height, char playerLetter) {
	int lineLength = 0;
	for (int i = 0; i < 7; i ++) {
	    if(lineLength !=4) {
		if (board[i].column[height] != null && board[i].column[height].color == playerLetter) {
		    lineLength++;
		} else {
		    lineLength = 0;
		}
	    } else {
		break;
	    }
	}
	return lineLength == 4;
    }
    
    private static boolean verticalCheck(Column column, char playerLetter) {
	int lineLength = 0;
	for (int i = column.size - 1; i > 0; i--) {
	    if (lineLength != 4) {
		if (column.column[i] != null && column.column[i].color == playerLetter) {
		    lineLength++;
		} else {
		    lineLength = 0;
		}
	    } else {
		break;
	    }
	}
	
	return lineLength == 4;
	
    }
    
    private static boolean diagonalCheck(Column[] board, char playerLetter, int lastColumn, int height) {
	
    }
}
