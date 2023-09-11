/* <CSCI 201 >
<09/10/23>
<Beth Powell>
*/

package edu.unca.csci201;

public class Box {

	//instance variables below:
	private int height;
	private int width;
	private int depth;
	private boolean full;
	
	//Box constructor below:
	Box(int height, int width, int depth) {
		this.height = height;					//first height from instance var., second height from parameters
		this.width = width;
		this.depth = depth;
		this.full = false;
	
	}
	
	//Creating custom toString method below:
	
	public String toString() {
		String boxFullnessClause;
		
		if (this.isFull()) {
			boxFullnessClause = " This box is like so full.";
		} else {
			boxFullnessClause = " This box is empty.";
		}
		
		return "The box is " + this.getHeight() +" inches tall," + 
				" " + this.getWidth() +" inches wide," + 
				" and " + this.getDepth() + " inches deep." +
				boxFullnessClause;
	}
	
	//Getter Setter methods for instance data
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public boolean isFull() {
		return full;
	}
	public void setIsFull(boolean isFull) {
		this.full = isFull;
	}
	
}


