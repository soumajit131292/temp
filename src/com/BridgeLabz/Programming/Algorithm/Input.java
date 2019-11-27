package com.BridgeLabz.Programming.Algorithm;


import java.util.Scanner;

/**
 * @author soumajit
 *
 *this program takes user input of int,string,boolean and double type
 */
public class Input {

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

	public static long inputLong() {

		return scanner.nextLong();
	}

}
