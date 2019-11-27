package com.BridgeLabz.Programming.Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	private static Scanner scanner = new Scanner(System.in);

	public boolean isThisDateValid(String dateToValidate) throws Exception {

		if (dateToValidate == null) {
			return false;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		sdf.setLenient(true);

		try {

			sdf.parse(dateToValidate);

		} catch (Exception e) {

			return false;
		}

		return true;
	}

	public String readTextFile() throws Exception {
		File file = new File(
				"/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/bridgeLabz/programming/regexpattern/text.txt");
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while (line != null) {

			sb.append(line);
			line = br.readLine();
		}

		return sb.toString();

	}

	public String getName() {
				System.out.println("enter your name");
		String name = scanner.next();

		return name;
	}

	public String getFullname() {

		System.out.println("enter your fulanme");
		String name = scanner.nextLine();

		return name;
	}

	public String getMobilenumber() {
		String mobilenumber;
		do {
			
			System.out.println("enter mobilenumber");
			mobilenumber = scanner.next();
		} while (mobilenumber.length()<10);

		return mobilenumber;
	}

	public String getDate() throws Exception{

		String name = scanner.next();
		if (isThisDateValid(name))
		return name;
		return null;
	}
	public static boolean binaryInt(int[] array, int value) {
	

		System.out.println("enter date");
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			
				if (value == array[mid]) {
                     return true;
                     
			}
			if (value < array[mid])
				end = mid - 1;
				
		
			if (value > array[mid])
				start = mid + 1;
		}

		return false;

	}

	public static boolean binaryString(String[] array, String value) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (value.compareTo(array[mid]) == 0) {

				return true;

			}
			if (value.compareTo(array[mid]) < 0)
				end = mid - 1;
			if (value.compareTo(array[mid]) > 0)
				start = mid + 1;
		}
		return false;

	}

	public static int[] insertionInteger(int[] array) {

		int length = array.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			int temp = array[i];
			while (j > -1 && temp < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
		return array;

	}

	public static String[] insertionString(String[] array) {

		int length = array.length;
		for (int i = 1; i < length; i++) {
			int j = i - 1;
			String temp = array[i];
			while (j > -1 && temp.compareTo(array[j]) < 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
		return array;

	}

	public static void bubbleInteger() {
		int[] array = { 6, 4, 3, 9, 1, 7, 5 };
		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1; j++) {
				int temp = 0;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("\n");
		for (int i = 0; i < length; i++)
			System.out.print(array[i] + " ");
	}

	public static void bubbleString(String[] array) {

		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1; j++) {
				String temp;
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("\n");
		for (int i = 0; i < length; i++)
			System.out.print(array[i] + " ");
	}

	public static long[] bubbleSortDescending(long[] time) {
		int length = time.length;
		for (int j = 0; j < length; j++) {
			for (int i = 1; i < length - 1; i++)
				if (time[i] < time[i + 1]) {
					long temp = time[i + 1];
					time[i + 1] = time[i];
					time[i] = temp;
				}
		}
		return time;
	}

	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}

		}
		return (count == 2);
	}

	public static char[] isAnagramString(String string) {

		char[] array = string.toCharArray();
		Arrays.sort(array);

		return array;
	}
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
