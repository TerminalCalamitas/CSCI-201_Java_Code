package edu.unca.csci201;

public class Main {

    public static void main(String[] args) {
	TaxCode tax = new TaxCode(4);
	System.out.println("Income 10000: " + tax.calculateTax(10000));
	System.out.println("Income 10001: " + tax.calculateTax(10001));
	System.out.println("Income 30000: " + tax.calculateTax(30000));	 
	System.out.println("Income 200000: " + tax.calculateTax(200000));
	System.out.println("Income 350000: " + tax.calculateTax(350000));
    }

}
