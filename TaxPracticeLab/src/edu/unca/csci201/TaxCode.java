package edu.unca.csci201;

public class TaxCode {
    private TaxBracket[] brackets;
    private boolean complete = false;

    public TaxCode(int size) {
	brackets = new TaxBracket[size];
	brackets[3] = new TaxBracket(0, 10000, .1); 
	brackets[0] = new TaxBracket(10000, 100000, .2); 
	brackets[1] = new TaxBracket(100000, 300000,.3); 
	brackets[2] = new TaxBracket(300000, Integer.MAX_VALUE, .4);
	 
    }

    public void addTaxBracket(int lowerBound, int upperBound, double taxRate) {
	if (complete) {
	    System.out.println("Tax Bracket is finished");
	    return;
	}

	for (int i = 0; i < brackets.length; i++) {
	    if (brackets[i] == null) {
		brackets[i] = new TaxBracket(lowerBound, upperBound, taxRate);
		break;
	    }
	}
    }

    public double calculateTax(double income) {
	if (!complete) {
	    System.out.println("Tax Bracket is not finished");
	    return -1;
	}

	double taxOwed = 0;
	double taxableIncome = 0;
	for (int i = 0; income > brackets[i].getLowerBound() && i < brackets.length; i++) {

	    if (income > brackets[i].getUpperBound()) {
		taxableIncome = brackets[i].getBracketSize();
		taxOwed += taxableIncome * brackets[i].getTaxRate();

	    } else if (income > brackets[i].getLowerBound()) {
		taxableIncome = income - brackets[i].getLowerBound();
		taxOwed += taxableIncome * brackets[i].getTaxRate();
	    }

	}

	return taxOwed;
    }

    private boolean freeze() {
	// Sort
	
	// Fix tax bracket outer bounds
	brackets[0].setLowerBound(0);
	brackets[-1].setUpperBound(Integer.MAX_VALUE);
	
	// Check for errors (gaps/overlaps)
	return 1==1;
    }

}
