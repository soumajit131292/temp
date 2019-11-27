package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit
 *
 *it converts decimal value to binary
 */
public class BinaryToDecimal {

	public static String ToBinary(int decimalnumber) {
		String binary = "";
		while (decimalnumber != 0) {
			binary = decimalnumber % 2 + binary;

			decimalnumber /= 2;
		}

		while (binary.length() % 4 != 0) {
			binary = 0 + binary;
		}

		return binary;
	}

	public static void main(String[] args) {

		int decimalnumber;

		do {
			System.out.println("enter positive decimal number");
			decimalnumber = Input.inputInteger();
		} while (decimalnumber <= 0);

		String result = ToBinary(decimalnumber);
		System.out.print("binary onversion is --- \n" + result);
	}

}
