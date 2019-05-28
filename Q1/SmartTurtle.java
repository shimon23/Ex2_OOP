package Q1;

import Turtle.*;

/**
 * 
 * Smart Turtle - Draws a square of a given length and a polygon with a number of sides in length
 *	Given.
 *
 */

public class SmartTurtle extends SimpleTurtle {
	/**
	 * draw a polygon in the given sides and size
	 * @param sides
	 * @param size
	 */

	public void drawPolygon (int sides, double size) { //draw a shape 
		int angle= (int) (1-(2/(double)sides)*180);
		for (int i = 0; i < sides; i++) {
			tailDown();
			this.moveForward(size);
			this.turnRight(angle);
		}
	}
	/**
	 * 
	 *draw a square in the given size
	 *@param size
	 */


	public void drawSquare (double size) {
		int angle = 90;
		for (int i = 0; i < size; i++) {
			tailDown (); 
			moveForward(size);
		}
		this.turnRight(angle);
		for (int i = 0; i < size; i++) {
			tailDown (); 
			moveForward (size);
		}
		this.turnRight(angle);
		for (int i = 0; i < size; i++) {
			tailDown (); 
			moveForward(size);
		}
		this.turnRight(angle);
		for (int i = 0; i < size; i++) {
			tailDown (); 
			moveForward(size);
		}


	}

	public static void main (String[]args) {
		SmartTurtle x = new SmartTurtle();
		x.drawPolygon(8,60);
		//x.drawSquare(10);
	}
}