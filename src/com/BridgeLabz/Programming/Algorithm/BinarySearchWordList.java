package com.BridgeLabz.Programming.Algorithm;

import java.io.File;
import java.util.Scanner;

public class BinarySearchWordList {

	/**
	 * It reads words from text file and searchs whether it presents or not
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\words.txt");

		Scanner scanner = new Scanner(file);
		try {

			StringBuilder sb = new StringBuilder();

			while (scanner.hasNext()) {
				sb.append(scanner.next());
			}
			System.out.print(sb);
			String str = sb.toString();
			String[] array = str.split(",");

			System.out.println("\nenter word");
			String word = Input.inputString();

			String[] res = Utility.insertionString(array);
			if (Utility.binaryString(res, word))
				System.out.println("found");
			else
				System.out.println("not found");
		} catch (Exception e) {
			System.out.println("wrong input");
		}

		finally {
			scanner.close();
		}

	}

}
