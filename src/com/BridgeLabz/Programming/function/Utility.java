package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 *
 *this program contains binary search integer
 *                      binary search word
 *                      insertion sort integer
 *                      insertion sort word
 *                      bubble sort integer
 *                      bubble sort word
 *                      bubble sort descending order integer
 *
 */
import java.util.Arrays;

public class Utility {

	public static boolean binaryInt(int[] array, int value) {

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
}

/*
 * public static void main(String[] args) { long[] a = new long[6]; long
 * startBiSt = System.nanoTime(); String[] str = { "abcd", "australia", "go",
 * "hello", "india" }; String valuestr = "abcd"; if (BinaryString(str,
 * valuestr)) { System.out.print("\n found");} else if (!BinaryString(str,
 * valuestr)) { System.out.print("\n found");}
 * 
 * long endBiSt = System.nanoTime(); long diffBiSt = endBiSt - startBiSt; a[0] =
 * diffBiSt / 1000;
 * 
 * long startBiIn = System.nanoTime(); int[] array = { 1, 2, 4, 6, 8, 9 }; int
 * valueint = 9; if (BinaryInt(array, valueint)) System.out.print("\n found");
 * else System.out.print("\n found"); long endBiIn = System.nanoTime(); long
 * diffBiIn = endBiIn - startBiIn; a[1] = diffBiIn / 1000;
 * 
 * 
 * long startInSt = System.nanoTime(); String[] adb = { "hello", "go", "india",
 * "australia", "abcd" }; String[] res = insertionString(adb);
 * System.out.print("\n"); for (int i = 0; i < res.length; i++)
 * System.out.print(res[i] + " "); long endInSt = System.nanoTime(); long
 * diffInSt = endInSt - startInSt; a[2] = diffInSt / 1000;
 * 
 * 
 * long startBuSt = System.nanoTime(); String[] abc = { "hello", "go", "india",
 * "australia", "abcd" }; BubbleString(abc); long endBuSt = System.nanoTime();
 * long diffBuSt = endBuSt - startBuSt; a[4] = diffBuSt / 1000;
 * 
 * 
 * long startBiiIn = System.nanoTime(); BubbleInteger(); long endBiiIn =
 * System.nanoTime(); long diffBiiIn = endBiiIn - startBiiIn; a[5] = diffBiiIn /
 * 1000; System.out.print("\n");
 * 
 * 
 * long startInIn = System.nanoTime(); int[] intarray = { 6, 4, 3, 9, 1, 7, 5 };
 * int[] result = insertionInteger(intarray);
 * 
 * for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
 * long endInIn = System.nanoTime(); long diffInIn = endInIn - startInIn; a[3] =
 * diffInIn / 1000;
 * 
 * System.out.print("\n");
 * 
 * System.out.println("\nshowing elapsed time in microsecond "); long[]
 * timeresult = bubbleSortDescending(a); for (int i = 0; i < timeresult.length;
 * i++) System.out.print(timeresult[i] + " ");
 * 
 * }
 */
