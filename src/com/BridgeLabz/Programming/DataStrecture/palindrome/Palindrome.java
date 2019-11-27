package com.BridgeLabz.Programming.DataStrecture.palindrome;

import com.BridgeLabz.Programming.Algorithm.Input;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("enter a string");
		String word = Input.inputString();
		int flag = 0;
		char[] wordarray = word.toCharArray();
		int size = word.length();
		Deque deque = new Deque();
		for (int i = 0; i < size; i++) {
			deque.addrear(wordarray[i]);
		}

		for (int i = 0; i < deque.size(); i++) {
			if (deque.removeFront() != deque.removeRear()) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("not a palindrome");
		else
			System.out.println("palindrome string");

	}

}
