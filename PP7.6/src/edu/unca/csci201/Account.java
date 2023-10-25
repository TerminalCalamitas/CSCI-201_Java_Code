package edu.unca.csci201;

public class Account {
    final double RATE = 0.035; // interest rate of 3.5%
    String name;
    int acctNumber;
    double balance;

    public Account(String owner, int account, double initial) {
	name = owner;
	acctNumber = account;
	balance = initial;
    }
    public double deposit(double amount) {
	if (amount > 0)
	    balance = balance + amount;
	return balance;
    }

    public double withdraw(double amount) {
	if (amount > 0 && amount < balance) {
	    balance = balance - amount;
	} else {
	    System.out.println("Not enough money in account.");
	}
	return balance;
    }
    
    public String toString() {
	return String.format(acctNumber + "\t" + name + "\t" + "$" + "%.2f", balance);
    }
}