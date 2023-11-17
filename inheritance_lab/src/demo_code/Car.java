package demo_code;

public class Car extends Vehicle {
    private int doors;
    
    public Car(int width, int cupholders) {
	super(width);
	this.doors = cupholders;
    }
    
    public Car(int width) {
	super(width);
	this.doors = 0;
    }
    
    public int getWidth() {
	return width;
    }

    public String toString() {
	return "Car [doors=" + doors + ", width=" + width + "]";
    }

}
