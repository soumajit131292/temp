package com.BridgeLabz.Programming.function;

import com.BridgeLabz.Programming.Algorithm.Input;

/**
 * @author soumajit
 *
 *this program finds the percent of head and tale
 *
 */
public class Flipcoin {

	public static double numberGenerate() {
		return Math.random();

	}

	public static void main(String[] args) {

		int number;
		do {
			System.out.println("enter positive number : ");
			number = Input.inputInteger();
		} while (number < 0);

		int head = 0;
		int tale = 0;
		double result;
		for (int i = 0; i < number; i++) {
			result = numberGenerate();
			if (result > 0.5)
				head++;
			else
				tale++;
		}

		System.out.println("percentage of head is "+(head * 100.0) / number);
		System.out.println("percentage of tale is "+(tale * 100.0) / number);

	}

}
