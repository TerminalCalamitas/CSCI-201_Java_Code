package demo_code;

public class ParkingSpace {
    protected boolean full;
    protected int width;
    protected Vehicle occupant;
    
    public ParkingSpace(int width) {
	this.width = width;
	full = false;
	occupant = null;
    }
    
    public boolean isFree() {
	return !full;
    }
    
    public int getWidth() {
	return width;
    }
    
    public boolean park(Vehicle v1) {
	if (!full && v1.getWidth() <= width) {
	    occupant = v1;
	    full = true;
	    
	    return true;
	}
	return false;
    }
    
    public Vehicle unPark() {
	full = false;
	
	return occupant;
    }

}
