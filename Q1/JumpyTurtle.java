package Q1;

import Turtle.*;
/**
 * 
 * Jumpy turtle - when it progresses is
 *	He goes on and off. The result is that when the tail is lowered it leaves a dashed line.
 *
 *
 */

public class JumpyTurtle extends SmartTurtle{
	boolean Up;
        
	public void tailUp(){
		super.tailUp();
		Up = true;
	}
	
	public void tailDown(){
		super.tailDown();
		Up = false;
	}
	/**
	 *  advance forward in the given distance
	 *  @param distance
	 */

	public void moveForward (double distance){
            double newDis = 5.7;
            if(Up == false){
                for(double i=0; i<distance/(2*newDis); i++){
                    tailDown();
                    super.moveForward(newDis);
                    tailUp();
                    super.moveForward(newDis);
                }
            }
            else super.moveForward(distance);
        }
	
     public static void main (String[]args) {
    	 JumpyTurtle x = new JumpyTurtle();
    	 x.drawPolygon(6, 40);
     }
}
