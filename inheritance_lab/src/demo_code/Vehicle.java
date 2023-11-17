package demo_code;

public abstract class Vehicle {
    protected int width;
    
    public Vehicle(int width) {
	this.width = width;
    }
    
    public abstract boolean park();
    public abstract int getWidth();

}
