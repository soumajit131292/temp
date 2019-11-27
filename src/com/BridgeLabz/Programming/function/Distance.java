package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *         this program finds distance between a given point and origin point
 *         means geometrical point
 */

public class Distance {

	public static void main(String[] args) {

		int x = InputUtility.inputInteger();
		int y = InputUtility.inputInteger();
		int z = x;
		float distance = (float) (Math.sqrt(Math.pow(Math.abs(x - 0), 2) + Math.pow(Math.abs(y - 0), 2)));
		System.out.print("the actual distance from origin to the point is " + distance);

	}

}
