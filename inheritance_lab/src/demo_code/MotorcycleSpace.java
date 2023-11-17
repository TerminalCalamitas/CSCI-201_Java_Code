package demo_code;

public class MotorcycleSpace extends ParkingSpace {
    private boolean veryGood;
    private int width;
    
    public MotorcycleSpace(int width, boolean good) {
	super(width);
	veryGood = good;
    }
    
    public boolean isGood() {
	return veryGood;
    }
    
    public boolean park(Motorcycle m1) {
	return super.park(m1);
    }

}
