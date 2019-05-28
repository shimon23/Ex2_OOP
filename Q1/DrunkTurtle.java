package Q1;

import java.util.Random;
import Turtle.*;
/**
 * 
 * A drunken turtle - When prompted to move forward for a distance x it performs the following actions:
 *	It moves to a random distance between 0 and x2.
 *	Turns at a random angle between 30 and 30 degrees.
 *
 */

public class DrunkTurtle extends Turtle {
	public static Random rand = new Random();
	/**
	 * draw a number for moving
	 * @param int x
	 */
	public void RandMoveFor(int x) { //draw a number for moving
		int range=1;
		int num = rand.nextInt(x)+range;
	super.moveForward(num);
	}	
	/**
	 *Turtle turn left according to probabillity
	 * @param int x
	 */

	public void turnDrunk(int x) {//turn left according to probabillity 
		RandMoveFor(2*x);
		int num = (int)(Math.random()*60)-30;
		if (-30<=num&&num < 0) {
			this.turnLeft(num);	
		}
		if (0<=num&&num <=30) {
			this.turnRight(num);	
		}
	}
	/**
	 * move drunk turtle
	 * @param int x
	 */

	public void moveDrunk(int x) { //move drunk turtle
		this.turnDrunk(x);
	}
	/**
	 * move regular-simple turtle
	 * @param distance
	 */	
	public void moveRegular(int distance) { //move regular-simple turtle
		super.moveForward(distance);
	}
	/**
	 * turn left regular-simple turtle
	 * @param degrees
	 */

	
	public void turnLeftRegular(int degrees) { 
		super.turnLeft(degrees);
	}
	/**
	 * turn right regular-simple turtle
	 * @param int degrees
	 */
	
	public void turnRightRegular(int degrees) { 
		super.turnRight(degrees);
	}
	/*
	public static void main (String[] args) {
		DrunkTurtle x = new DrunkTurtle();
		x.tailDown();
		x.moveDrunk(60);
	}*/
}

