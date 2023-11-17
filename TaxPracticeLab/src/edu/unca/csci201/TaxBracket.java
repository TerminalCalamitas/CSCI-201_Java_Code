package edu.unca.csci201;

public class TaxBracket {
    private int lowerBound;
    private int upperBound;
    private double taxRate;

    public TaxBracket(int lowerBound, int upperBound, double taxRate) {
	this.lowerBound = lowerBound;
	this.upperBound = upperBound;
	this.taxRate = taxRate;
    }
    
    public int getBracketSize() {
	return upperBound - lowerBound;
    }
    
    public int getLowerBound() {
        return lowerBound;
    }
    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }
    
    public int getUpperBound() {
        return upperBound;
    }
    
    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public double getTaxRate() {
        return taxRate;
    }
    
    

}
