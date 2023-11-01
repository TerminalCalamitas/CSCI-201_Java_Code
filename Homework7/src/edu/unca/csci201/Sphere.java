package edu.unca.csci201;

public class Sphere extends Shape3D {
    protected double radius;

    public Sphere(String shapeName, double radius) {
	super(shapeName);
	this.radius = radius;
    }

    public double getRadius() {
 	return radius;
     }

     public double getVolume() {
 	double volume = (4/3) * Math.PI * (radius * radius * radius);
 	return volume;
     }
}
