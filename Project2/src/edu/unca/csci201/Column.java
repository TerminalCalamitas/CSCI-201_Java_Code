package edu.unca.csci201;

public class Column {
    int size = 6;
    Disk[] column = new Disk[size];
    Disk topDisk;
    int height = 0;

    public Column() {
	// Assigning all values to null by default
	for (int i = 0; i < size; i++) {
	    column[i] = null;
	}
    }

    public boolean insert(Disk disk) {
	// Can't insert if the column is full
	if (!full()) {
	    for (int i = 0; i < size; i++) {
		if (column[i] == null) {
		    // Set the first empty index in the column to the disk
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
    
    // height is the top disk in the column
    public boolean full() {
	return height == size;
    }
    
    // 
    public Disk get(int rowIndex) {
	return column[rowIndex];
    }
}
