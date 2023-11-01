package edu.unca.csci201;

public class Cube extends Shape3D {
    protected double sideLength;
    protected String color;
    
    public Cube(String shapeName, double sideLength, String color) {
	super(shapeName);
	this.sideLength = sideLength;
	this.color = color;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String getColor() {
        return color;
    }
    
    public double getVolume() {
	return (sideLength * sideLength * sideLength);
    }
    
    
}
