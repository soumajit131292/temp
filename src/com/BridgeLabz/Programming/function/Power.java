package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program finds power of 2
 *
 */
public class Power {

	public static void main(String[] args) {

		int number;
		do {
			System.out.println("Enter number : ");
			number = InputUtility.inputInteger();
		} while (number < 0 && number >= 31);

		int result = 1;
		if (number == 0)
			System.out.print(1);
		else {
			for (int i = 1; i <= number; i++) {
				result = result * 2;

			}
			System.out.print(result);
		}

	}

}
