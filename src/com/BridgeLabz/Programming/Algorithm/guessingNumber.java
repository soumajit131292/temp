package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit
 * 
 *         this program asks user recursively whether a choosen value is in that
 *         range and finally prints the result
 *
 *
 */
public class guessingNumber {
	public static void result(int start, int end) {
		int mid = (start + end) / 2;
		if (start == end) {
			System.out.println("your choosen number is " + end);
			return;
		}
		System.out.println("press false for value between of " + start + " and " + mid
				+ "\nprees true for lower value of " + (mid + 1) + " and " + end);

		boolean ch = Input.inputBoolean();
		if (ch) {
			start = mid + 1;
			result(start, end);
		} else {
			end = mid;
			result(start, end);
		}
	}

	public static void main(String[] args) {

		System.out.println("enter a number");
		result(0, Input.inputInteger() - 1);

	}

}
