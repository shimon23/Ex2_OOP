package Q2;

import java.util.Scanner;

public class SquareEquation {
	private static boolean ans = true;

	public static void main(String[] args) {
		sqEquation();
	}
	/**
	 * Solving quadratic equation
	 */


	public static void sqEquation() {

		while (ans == true) {

			double a;
			double b;
			double c;

			System.out.println("aX^2+bX+c=0: Enter a,b,c:");
			System.out.print("Enter a:");
			Scanner s = new Scanner(System.in);
			a = s.nextDouble();
			System.out.print("Enter b:");
			Scanner y = new Scanner(System.in);
			b = y.nextDouble();
			System.out.print("Enter c:");
			Scanner z = new Scanner(System.in);
			c = z.nextDouble();

			try {
				sqEq(a, b, c);
			} catch (SquareEquationException e) {
				e.printStackTrace();
			}
		}
		System.out.println("bye bye");
	}
	/**
	 * Solving quadratic equation
	 * @param double a
	 * @param double b
	 * @param double c
	 * @throws SquareEquationException
	 */
	public static void sqEq(double a, double b, double c) throws SquareEquationException {

		if ((b * b - 4 * a * c) > 0) {
			if (a == 0 && b != 0 && c != 0) {
				double x1 = ((-1) * c) / (b);
				System.out.println("x1=x2=" + x1);
			} else {
				double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.println(a + "X^2" + "+" + b + "X" + "+" + c + "=0");
				System.out.println("x1: " + x1 + "  " + "x2:" + x2);
				continuegame();
			}
		}

		else if ((b * b - 4 * a * c) == 0 && checkabc(a, b, c)) {
			if (a != 0) {
				double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.println("x1=x2=" + x1);
				System.out.println(a + "X^2" + "+" + b + "X" + "+" + c + "=0");
			}
			continuegame();
		}

		else {
			try {
				if ((b * b - 4 * a * c) < 0) {
					throw new SquareEquationException("Error: NO real roots!");
				}
				if (a == 0 && b == 0 && c == 0) {
					throw new SquareEquationException("x1 can be any number - trivial");
				}
				if (a == 0 && b == 0 && c != 0) {
					throw new SquareEquationException("Error, no answer!");
				}
			} catch (SquareEquationException e) {
				e.printStackTrace();
			}

			finally {
				continuegame();
			}

		}
	}

	/**
	 *  check if the user want to solve to or exit
	 * @return boolean
	 */
	public static boolean continuegame() {
		System.out.println("Enter 0 or any number to Exit or 1 to solve aX^2+bX+c=0");
		System.out.println();
		Scanner f = new Scanner(System.in);
		int k;
		k = f.nextInt();
		if (k == 1) {
			ans = true;
			return ans;
		} else {
			ans = false;
			return ans;
		}
	}

	/**
	 *  check if the value of a, b and c not equal to zero
	 * @param double a
	 * @param double b
	 * @param double c
	 * @return boolean
	 */
	public static boolean checkabc(double a, double b, double c) {
		if (a == 0 && b == 0 && c == 0) {
			return false;
		}
		if (a == 0 && b == 0 && c != 0) {
			return false;
		} else {
			return true;
		}

	}

}
