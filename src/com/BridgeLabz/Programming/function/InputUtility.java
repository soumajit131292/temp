package com.BridgeLabz.Programming.function;


import java.util.Scanner;

/**
 * @author soumajit
 *
 *this program takes integer double string boolean type user input
 */
public class InputUtility {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputInteger() {

		return scanner.nextInt();
	}

	public static String inputString() {
		return scanner.next();
	}

	public static boolean inputBoolean() {
		return scanner.nextBoolean();
	}

	public static double inputDouble() {

		return scanner.nextDouble();
	}

}
