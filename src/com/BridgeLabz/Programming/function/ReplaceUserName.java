package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 * 
 * this program replaces a string
 */
public class ReplaceUserName {

	public static void main(String[] args) {

		String name = "Hello <<UserName>>";

		String s;
		do {
			System.out.println("Enter your name : ");
			s = InputUtility.inputString();
		} while (s.length() < 3);

		String newstring = name.replaceAll("<<UserName>>", s);
		System.out.println("\n" + newstring);

	}

}
