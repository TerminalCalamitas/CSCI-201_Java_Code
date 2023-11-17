package demo_code;

import java.util.Random;

public class ParkingLot {
    private ParkingSpace[] lot;
    private Random rand = new Random();
    
    // Random from Lengh
    public ParkingLot(int size) {
	lot = new ParkingSpace[size];
	
	for(int i = 0; i < size; i++) {
	    if(rand.nextInt(0,4) == 0 ) {
		lot[i] = new MotorcycleSpace(3, false);
	    } else {
		lot[i] = new ParkingSpace(7);
	    }
	}
    }
    
    // User generated from array
    public ParkingLot(String[] userSpaces) {
	for (int i = 0; i < userSpaces.length; i++) {
	    // Default value is normal only gets changed if motorcycle or very good
	    if (userSpaces[i].equals("motorcycle")) {
		lot[i] = new MotorcycleSpace(3, false);
		
	    } else if (userSpaces[i].equals("very good motorcycle")) {
		lot[i] = new MotorcycleSpace(3, true);
	    
	    } else {
		lot[i] = new ParkingSpace(7);
	    }
		
	}
    }
    
    // loop park method
    public boolean Park(Vehicle v1) {
	int vWidth = v1.getWidth();
	if (vWidth <= 3) {
	    int firstMotorcycle = -1;
	    for (int i = 0; i < lot.length; i++) {
		if (lot[i].getWidth() <= 3 && lot[i].isFree()) {
		    firstMotorcycle = i;
		    if (lot[i].isGood()) {
			
		    }
		}
	    }
	    
	}
	
	
	
    }
}
