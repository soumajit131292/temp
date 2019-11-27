package com.BridgeLabz.Programming.Algorithm;


import java.util.Arrays;

/**
 * @author soumajit
 *
 *this program merges two arrays in sorted order
 *
 */
public class Merge {
	public static int[] merge(int[] array) {

		int length = array.length;
		int middle = length / 2;
		if (length <= 1)
			return array;

		int[] left;
		int[] right;
		left = new int[middle];
		if (length % 2 == 0)
			right = new int[middle];
		else
			right = new int[middle + 1];
		
		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = array[middle + i];
		}

		int[] result = new int[array.length];

		left = merge(left);
		right = merge(right);
		result = sort(left, right);
		return result;

	}

	public static int[] sort(int[] left, int[] right) {

		int[] result = new int[left.length + right.length];
		int leftpointer = 0, rightpointer = 0, resultpointer = 0;
		while (leftpointer < left.length || rightpointer < right.length) {
			if (leftpointer < left.length && rightpointer < right.length) {
				if (left[leftpointer] < right[rightpointer]) {
					result[resultpointer++] = left[leftpointer++];
				}
				else  {
					result[resultpointer++] = right[rightpointer++];
				}
			}
			else if (leftpointer < left.length) {
				result[resultpointer++] = left[leftpointer++];
			}
			else if (rightpointer < right.length) {
				result[resultpointer++] = right[rightpointer++];
			}

		}
		return result;

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 2, 7, 1, 3, 9, 14, 5 };
		int[] sortedarray = merge(array);
		System.out.println(Arrays.toString(sortedarray));
	}
}
