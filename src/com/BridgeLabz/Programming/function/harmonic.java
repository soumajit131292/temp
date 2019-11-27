package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program finds a harmonic number of a given number
 *
 */
public class harmonic {

	public static void main(String[] args) {

		int number;
		do {
			System.out.println("enter the number");
			number = InputUtility.inputInteger();
		} while (number == 0);

		float result = 0;

		for (float i = 1; i <= number; i++) {
			result = (1 / i) + result;

		}
		System.out.println("the result is "+result);
	}

}
