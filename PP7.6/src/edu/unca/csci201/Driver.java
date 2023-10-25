package edu.unca.csci201;

import java.util.Random;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// random first names
	String[] firstNames = { "Karlson", "Gabe", "Bob", "James", "Casey", "Walter", "Sophia", "Liam", "Olivia",
		"Noah", "Ava", "Jackson", "Jesse", "Ethan", "Mia", "Aiden", "Lucas", "Amelia", "Mason", "Harper" };
	// random last names
	String[] lastNames = { "Newell", "White", "Smith", "Bond", "Builder", "Pinkman", "Brown", "Davis", "Wilson",
		"Harris", "Lee", "Walker", "Turner", "Clark", "Hall" };

	Random rand = new Random();

	Account[] accounts = new Account[30];
	// Initialize accounts with random initial balances
	for (int i = 0; i < rand.nextInt(1, 30); i++) {
	    // Generates a random name to initialize first accounts
	    String name = "" + firstNames[rand.nextInt(0, firstNames.length)] + " "
		    + lastNames[rand.nextInt(0, lastNames.length)];
	    
	    // generates inital money ammount between 0 and 10000 with only two decimal places
	    double money = Math.random() * 1000000;
	    money = Math.round(money);
	    money = money / 100;
	    
	    // making account with the generated info
	    newAccount(accounts, name, i, money);
	}
	
	// starting accounts
	listAccounts(accounts);
	
	int choice = 0;
	int accNum = -1;
	while (choice != -1) {
	    System.out.println();
	    System.out.print("What would you like to do?\n"
	    	+ " 1) List currently open accounts\n"
	    	+ " 2) Create new account\n"
	    	+ " 3) Remove account\n"
	    	+ " 4) Add Interest\n"
	    	+ " 5) Make Deposit\n"
	    	+ " 6) Make Withdrawl\n"
	    	+ "-1) Exit program\n"
	    	+ "Choice: ");
	    
	    choice = Integer.parseInt(input.nextLine());
	    
	    if (choice != 1 && choice != 4 && choice != -1) {
		System.out.print("Enter the account number (1-30): ");
		accNum = Integer.parseInt(input.nextLine()) - 1;

		while (accounts[accNum] == null) {
		    System.out.print("Enter a valid account");
		    accNum = Integer.parseInt(input.nextLine()) - 1;

		}
		
	    }
	    
	    switch (choice) {
	    case 1:
		listAccounts(accounts);
		break;
		
	    case 2:
		System.out.print("Enter account name: ");
		String name = input.nextLine();
		System.out.print("Enter starting balance: ");
		Double balance = Double.parseDouble(input.nextLine());
		newAccount(accounts, name, accNum, balance);
		System.out.println("Account created");
		break;
		
	    case 3:
		accounts[accNum] = null;
		System.out.println("Account removed.");
		break;
		
	    case 4:
		addInterest(accounts);
		System.out.println("Interest added.");
		break;
	    case 5:
		System.out.print("Enter deposit ammount: ");
		double deposit = Double.parseDouble(input.nextLine());
		accounts[accNum].deposit(deposit);
		break;
		
	    case 6:
		System.out.print("Enter withdrawl ammount: ");
		double withdrawl = Double.parseDouble(input.nextLine());
		accounts[accNum].withdraw(withdrawl);
		break;
		
	    default:
		break;
	    }
	    
	}
	
	// final accounts
	System.out.println("\nFinal Account Values");
	listAccounts(accounts);
    }
    
    public static void listAccounts(Account[] accounts) {
	// printing the final accounts
	for (int i = 0; i < accounts.length; i++) {
	    if (accounts[i] != null) {
		System.out.println(accounts[i]);
	    }
	}
	System.out.println();
    }
    
    public static void newAccount(Account[] array, String name, int index, Double balance) {
	array[index] = new Account(name, index + 1, balance);
    }
    
    public static void addInterest(Account[] accounts) {
	for (int i = 0; i < accounts.length; i++) {
	    Account account = accounts[i];
	    if ( account != null) {
		accounts[i].balance += (accounts[i].balance * accounts[i].RATE);
		
	    }
	}
    }
}
