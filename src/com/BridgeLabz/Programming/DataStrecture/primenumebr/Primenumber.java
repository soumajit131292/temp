package com.BridgeLabz.Programming.DataStrecture.primenumebr;

public class Primenumber {

	public static boolean findPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		return false;
	}

	public static void main(String[] args) {

		int[][] array = new int[10][100];
		int number = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {

				if (findPrime(number)) {
					array[i][j] = number;
					System.out.print(array[i][j] + ",");
				}
				number++;

			}
			System.out.println("\n");
		}


	}

}
