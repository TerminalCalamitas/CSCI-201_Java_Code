package us.TermialCalamitas.Oauth;

import java.util.Scanner;

public class TagExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in the range 1-8: ");
        int inputNumber = scanner.nextInt();

        // Check if the input is within the valid range
        if (inputNumber < 1 || inputNumber > 8) {
            System.out.println("Invalid input. Please enter a number in the range 1-8.");
        } else {
            // Convert the number to the range 0-7
            int convertedNumber = 8 - inputNumber;
            
            System.out.println("Converted number: " + convertedNumber);
        }

        scanner.close();
    }
}
