package edu.unca.csci201;


public abstract class Shape3D {
    protected String shapeName;
    
    public Shape3D(String shapeName) {
	this.shapeName = shapeName;
    }
    
    public String getShapeName() {
	return shapeName;
    }
    
    public abstract double getVolume();
}
