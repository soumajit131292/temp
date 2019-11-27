package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit it first converts decimal value to binary value and then
 *         swaps two nibbles and finds again the decimal value
 *
 */
public class Binary {

	public static void main(String[] args) {
		int decimalnumber;
		int decimalconversion = 0;
		do {
			System.out.println("enter positive decimal number");
			decimalnumber = Input.inputInteger();
		} while (decimalnumber <= 0);

		String result = BinaryToDecimal.ToBinary(decimalnumber);
		String nibble1 = result.substring(0, result.length() / 2);
		String nibble2 = result.substring(result.length() / 2, result.length());
		result = nibble2 + nibble1;
		System.out.println(result);
		String[] resultarray = result.split("");
		int[] array = new int[result.length()];
		for (int i = 0; i < result.length(); i++) {
			array[i] = Integer.parseInt(resultarray[i]);
		}
		int j = result.length() - 1;

		for (int i = 0; i < result.length(); i++) {
			decimalconversion = array[i] * ((int) (Math.pow(2, j))) + decimalconversion;

			j--;
		}
		System.out.println(decimalconversion);
	}
}