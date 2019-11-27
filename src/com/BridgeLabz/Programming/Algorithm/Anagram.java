package com.BridgeLabz.Programming.Algorithm;

import java.util.Arrays;

/**
 * @author soumajit
 *
 *Anagram method is checking if two strings are anagram or not
 *
 */
public class Anagram {

	public static void main(String[] args) {

		System.out.println("Enter a string : ");
		String string1 = Input.inputString().replaceAll("\\s", "");
		System.out.println("Enter a string : ");
		String string2 = Input.inputString().replaceAll("\\s", "");

		if (string1.length() != string2.length()) {
			System.out.println("they are not anagram");
		} else {

			char[] array_of_string1 = Utility.isAnagramString(string1);
			char[] array_of_string2 = Utility.isAnagramString(string2);

			if (Arrays.equals(array_of_string1, array_of_string2))
				System.out.println("they are anagram string");
			else
				System.out.println("they are not anagram string");

		}

	}

}
