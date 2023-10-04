package edu.unca.csci201;
import java.util.Scanner;

public class WordleGame {
    private static final String SECRET_WORD = "PORGY";
    private static final int MAX_ATTEMPTS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Welcome to Wordle!");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess a 5-letter word.");
        System.out.println("Enter your guess:");

        while (attempts < MAX_ATTEMPTS) {
            String guess = scanner.nextLine().toUpperCase();

            if (guess.equals(SECRET_WORD)) {
                System.out.println("Congratulations! You've guessed the word: " + SECRET_WORD);
                break;
            } else {
                String feedback = getFeedback(SECRET_WORD, guess);
                System.out.println("Feedback: " + feedback);
                attempts++;
                System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }
        }

        if (attempts >= MAX_ATTEMPTS) {
            System.out.println("Sorry, you're out of attempts. The word was: " + SECRET_WORD);
        }

        scanner.close();
    }

    private static String getFeedback(String secretWord, String guess) {
        StringBuilder feedback = new StringBuilder();

        for (int i = 0; i < secretWord.length(); i++) {
            char secretChar = secretWord.charAt(i);
            char guessChar = guess.charAt(i);

            if (secretChar == guessChar) {
                feedback.append(secretChar);
            } else if (secretWord.contains(String.valueOf(guessChar))) {
                feedback.append("+");
            } else {
                feedback.append("-");
            }
        }

        return feedback.toString();
    }
}