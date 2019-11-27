package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program finds finds the root of a quadratic equation
 */
public class Quadratic {

	public static void main(String[] args) {

		System.out.println("enter the value of a ,b , c ");
		int a = InputUtility.inputInteger();
		int b = InputUtility.inputInteger();
		int c = InputUtility.inputInteger();

		int d = (b * b - 4 * a * c);

		if (d > 0) {
			System.out.println("x= " + (float) ((-b) + (float) Math.sqrt(d)) / 2 * a);
			System.out.println("y= " + (float) ((-b) - (float) Math.sqrt(d)) / 2 * a);
		} else if (d < 0) {

			System.out.println(
					"x= " + (float) (-b) / (2 * a) + "+" + " i" + ((float) (Math.sqrt(Math.abs(d)) / (2 * a))));

			System.out.println(
					"y= " + (float) (-b) / (2 * a) + "-" + " i" + ((float) (Math.sqrt(Math.abs(d)) / (2 * a))));
		} else {
			System.out.println("x= " + (float) ((-b) + (float) Math.sqrt(d)) / (2 * a));
			System.out.println("x= " + (float) ((-b) + (float) Math.sqrt(d)) / (2 * a));

		}

	}

}
