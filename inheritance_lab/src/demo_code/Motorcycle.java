package demo_code;

public class Motorcycle extends Vehicle {
    private boolean windshield;
    
    public Motorcycle(int width, boolean windshield) {
	super(width);
	this.windshield = windshield;
    }
    
    public Motorcycle(int width) {
	super(width);
	this.windshield = false;
    }
    
    public String toString() {
	return "Motorcycle [windshield=" + windshield + ", width=" + width + "]";
    }



    public int getWidth() {
	return width;
    }

}
