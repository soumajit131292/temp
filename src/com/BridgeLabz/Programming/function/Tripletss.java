package com.BridgeLabz.Programming.function;

/**
 * @author soumajit
 * 
 * this program finds the triplets and counts the number of triplets
 */
public class Tripletss {
	public static void triplets(int[] a, int size) {
		int count = 0;
		for (int i = 0; i < size - 2; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++)
					if (a[i] + a[j] + a[k] == 0) {
						count++;
						System.out.print("triplet value are : \n");
						System.out.print(a[i] + "," + a[j] + "," + a[k] + ",");
						System.out.print("\n");
					}
			}
		}
		System.out.println("total number of triplets : " + count);

	}

	public static void main(String[] args) {

		System.out.println("enter the array size");
		int size = InputUtility.inputInteger();
		int[] a = new int[size];
		for (int i = 0; i < size; i++)
			a[i] = InputUtility.inputInteger();

		triplets(a, size);

	}
}
