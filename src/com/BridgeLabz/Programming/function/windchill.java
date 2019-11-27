package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program finds the windchill
 */
public class windchill {

	public static void main(String[] args) {

		int t, v;

		do {
			System.out.println("enter the t : ");
			t = InputUtility.inputInteger();
		} while (Math.abs(t) > 50);

		do {
			System.out.println("enter the v : ");
			v = InputUtility.inputInteger();
		} while (v > 120);

		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("windchill is : " + w);

	}

}
