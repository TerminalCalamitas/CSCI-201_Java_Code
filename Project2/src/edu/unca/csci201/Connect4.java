package edu.unca.csci201;

import java.util.Scanner;

public class Connect4 {

    public static void main(String[] args) {
	play(); // starting the game
    }

    public static void play() {
	// Initializing board
	Board board = new Board();
	// Only used to keep track of player turns
	int turnNum = 0;
	System.out.println(board);

	// loops until I break out in the case of a win
	while (true) {
	    char playerLetter = 'B';
	    // The turn starts as a black turn and only changes to red if the game is on a
	    // even turn
	    if (turnNum % 2 == 0) {
		playerLetter = 'R';
	    }

	    // playerTurn returns true if there is a win condition
	    if (playerTurn(board, playerLetter)) {
		// Simple way of handling who won
		if (playerLetter == 'R') {
		    System.out.println("Red Wins!");
		} else {
		    System.out.println("Black Wins!");
		}

		// Breaks out of the while loop
		break;
	    }

	    turnNum++;
	}
	// Prints after game is won
	System.out.println("Game over.");
    }

    private static boolean playerTurn(Board board, char playerLetter) {
	Scanner input = new Scanner(System.in);

	// Logic to print color rather than char
	String color = "";
	if (playerLetter == 'R') {
	    color = "Red";
	} else {
	    color = "Black";
	}
	System.out.println(color + "'s turn:");

	// Column that the disk will be played in
	int index = 0;

	// while loop breaks when disk is played
	while (true) {
	    System.out.print("Choose a column (1-7): ");
	    // Checks if int is in the input so a string doesn't crash the program
	    if (input.hasNextInt()) {
		index = Integer.parseInt(input.nextLine());

		if (index > 0 && index <= 7) {
		    // If the piece is succesfully placed break out of the loop
		    if (board.insert(new Disk(playerLetter), index - 1)) {
			break;
		    }
		}
		// If the code reaches here there was a number but it couldn't be played
		System.out.println("Invalid move, please try again.");

	    } else { // Code here is if there wasn't a number in the code
		System.out.println("Invalid move, please try again.");
		input.nextLine(); // get's rid of any potential \n tokens
	    }
	}
	System.out.println(board);
	return checkForWin(board, playerLetter, index - 1);
    }

    private static boolean checkForWin(Board board, char playerLetter, int lastIndex) {
	// Changes board into something we can use
	Column[] columns = board.board;
	int diskHeight = columns[lastIndex].height;

	// Returns if there is a win or not
	if (horizontalCheck(columns, diskHeight, playerLetter) || verticalCheck(columns[lastIndex], playerLetter)
		|| diagonalCheck(columns, playerLetter, lastIndex, diskHeight)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean horizontalCheck(Column[] board, int height, char playerLetter) {
	int lineLength = 0;
	// Loops from left to right at one height
	for (int i = 0; i < 7; i++) {
	    // I don't want to do anything to the length if there is already a win
	    if (lineLength != 4) {
		// Makes sure the location isn't null then checks if the color is the same
		if (board[i].column[height] != null && board[i].column[height].color == playerLetter) {
		    lineLength++;
		} else { // Since there can't be a win with RBRR reset the length whenever we don't find
			 // the char
		    lineLength = 0;
		}
	    } else { // Breaks since we found a win
		break;
	    }
	}
	return lineLength == 4; // Boolean return if there is a win or not
    }

    // Mostly the same as the horizontalCheck
    private static boolean verticalCheck(Column column, char playerLetter) {
	int lineLength = 0;
	for (int i = 0; i < column.size; i++) {
	    if (lineLength != 4) { // Avoid changing a win condition
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
	// It's more efficient to check both diagonals at once so initializing both
	// lengths
	int diagonalDown = 0;
	int diagonalUp = 0;

	// I used the range [-3, 3] since that is the maximum distance that matters
	for (int i = -3; i < 3; i++) {
	    // values for Diagonal Down dD
	    int dDRow = height - i;
	    int dDColumn = lastColumn + i;
	    // values for Diagonal Up dU
	    int dURow = height + i;
	    int dUColumn = lastColumn + i;

	    // Really long statement to make sure it's in the box
	    if (dDRow >= 0 && dDRow < 6 && dDColumn >= 0 && dDColumn < 7) {
		// checking if that coordinate is the players color and not null
		if (board[dDColumn].column[dDRow] != null && board[dDColumn].column[dDRow].color == playerLetter) {
		    diagonalDown++;
		} else {
		    diagonalDown = 0;
		}
	    }

	    // Doing the same thing for the diagonal up direction
	    if (dURow >= 0 && dURow < 6 && dUColumn >= 0 && dUColumn < 7) {
		if (board[dUColumn].column[dURow] != null && board[dUColumn].column[dURow].color == playerLetter) {
		    diagonalUp++;
		} else {
		    diagonalUp = 0;
		}
	    }
	}

	return diagonalDown == 4 || diagonalUp == 4;
    }
}
