package edu.unca.csci201;

public class Column {
    int size = 6;
    Disk[] column = new Disk[size];
    Disk topDisk;
    int height = 0;
    
    public Column() {
	for (int i = 0; i < size; i++) {
	    column[i] = null;
	}
    }
    
    public boolean insert(Disk disk) {
	if (!full()) {
	    for (int i = size - 1; i > 0; i--) {
		if (column[i] == null) {
		    column[i] = disk;
		    // stuff that needs to change on a successful turn
		    topDisk = disk;
		    height = i;
		    break;
		}
	    }
	}
	return false;
    }
    
    public int size() {
	return size;
    }
    
    public boolean full() {
	return height == size;
    }
    
    public Disk get(int rowIndex) {
	return column[rowIndex];
    }
}
