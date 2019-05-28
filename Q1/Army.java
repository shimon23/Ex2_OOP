package Q1;

import java.util.Scanner;

import Turtle.*;
public class Army {
	/**
	 * 
	 * @author zohar, shimon.
	 * 
	 * In this class we define several types of turtles.
	 * Define their properties as well.
	 *	
	 */


	final static int numOfTurtles = 5; // number of turtle in the army
	static Turtle[] turtlesArmy = new Turtle[numOfTurtles];

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int userInput;
		for (int choice = 0; choice < numOfTurtles; choice++) { // choose 4 types of turtles
			System.out.println("Choose the type of a turtle:");
			System.out.println("1.	Simple");
			System.out.println("2.	Smart");
			System.out.println("3.	Drunk");
			System.out.println("4.	Jumpy");
			userInput = reader.nextInt(); // get user choice for menu
			switch (userInput) {
			case 1: // simple
				turtlesArmy[choice] = new Turtle();
				break;
			case 2:// SmartTurtle
				turtlesArmy[choice] = new SmartTurtle();
				break;
			case 3:// DrunkTurtle
				turtlesArmy[choice] = new DrunkTurtle();
				break;
			case 4:// JumpyTurtle
				turtlesArmy[choice] = new JumpyTurtle();
				break;
			}
		}
		System.out.println("The army is ready!");
		showAllTurtles();
		turtlesTailUp();
		putInLine();
		turtlesTailDown();
		moveAllTurtles(100);
		turtlesTurnRight(90);
		moveAllTurtles(60);
		drawPolygonArmy(6,70);
		hideAllTurtles();
	}
	/**
	 * The turtle lifts the tail
	 * 
	 */
	private static void turtlesTailUp() { //all turtles tali's up
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].tailUp();
		}
	}
	/**
	 * The turtle takes off the tail
	 */

	private static void turtlesTailDown() {  //all turtles tali's down
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].tailDown();
		}
	}
	/**
	 * A function that moves the turtle forward
	 * @param turtle
	 * @param distance
	 */

	private static void moveTurtle(Turtle turtle, int distance) { //move turtles forward 
		if (turtle instanceof DrunkTurtle) { //move regular
			((DrunkTurtle)turtle).moveDrunk(distance);
			return;
		}
		if (turtle instanceof JumpyTurtle) {//move regular
			((JumpyTurtle)turtle).moveForward(distance);
			return;
		}
		turtle.moveForward(distance);
	}
	/**
	 * A function that moves the turtle to the left
	 * @param turtle
	 * @param degrees
	 */

	private static void turnLeftTurtle(Turtle turtle, int degrees) {//turn left 
		if (turtle instanceof DrunkTurtle) { //turn regular
			((DrunkTurtle)turtle).turnLeftRegular(degrees);
			return;
		}
		turtle.turnLeft(degrees);
	}
	/**
	 * A function that moves the turtle to the right
	 * @param turtle
	 * @param degrees
	 */

	private static void turnRightTurtle(Turtle turtle, int degrees) {//turn left 
		if (turtle instanceof DrunkTurtle) {//turn regular
			((DrunkTurtle)turtle).turnRightRegular(degrees);
			return;
		}
		turtle.turnRight(degrees);
	}
	/**
	 * A function that sets different turtles in one row
	 */

	private static void putInLine() {// arange turtles in one line
		int counter =1;
		for (int i = 1; i < turtlesArmy.length; i++) {
			turnRightTurtle(turtlesArmy[i],90);
			moveTurtle(turtlesArmy[i],90*counter);
			turnLeftTurtle(turtlesArmy[i],90);
			counter++;
		}
	}
	/**
	 * A function that moves all turtles
	 * @param distance
	 */

	private static void moveAllTurtles(double distance) {// all turtles move according to it's rules
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].moveForward(distance);
		}
	}
	/**
	 * all turtles turn left
	 * @param degrees
	 */

	private static void turtlesTurnLeft(int degrees) {// all turtles turn according to it's rules
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].turnLeft(degrees);
		}
	}
	/**
	 * all turtles turn right
	 * @param degrees
	 */

	private static void turtlesTurnRight(int degrees) {// all turtles turn according to it's rules
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].turnRight(degrees);
		}
	}
	/**
	 * Draw a polygon on sides of a given size
	 * @param sides
	 * @param size
	 */


	private static void drawPolygonArmy(int sides,int size) {// turtle that knows- draw
		for (int i = 0; i < numOfTurtles; i++) {
			if (turtlesArmy[i] instanceof SmartTurtle) {
				((SmartTurtle) turtlesArmy[i]).drawPolygon(sides, size);
			}

		}
	}
	/**
	 * Remove all turtles
	 */

	private static void hideAllTurtles() {// turtles disappear
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].hide();
		}
	}
	/**
	 * View all turtles
	 */

	private static void showAllTurtles() { //show turtles
		for (int i = 0; i < numOfTurtles; i++) {
			turtlesArmy[i].show();
		}
	}
}
