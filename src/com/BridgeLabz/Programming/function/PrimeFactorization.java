package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 * this program finds prime factorization of a given number
 */
public class PrimeFactorization {

	public static void main(String[] args) {

		int number;

		do {
			System.out.println("enter the number");
			number = InputUtility.inputInteger();
		} while (number <= 0);

		while (number % 2 == 0) {
			System.out.print(2 + " ");
			number = number / 2;
		}
		int newnumber = number;
		for (int i = 3; i <= Math.sqrt(newnumber); i = i + 2) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
		if (number > 2)
			System.out.print(number + " ");

	}

}
