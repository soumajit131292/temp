package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit
 * 
 *         this program finds prime number of a range between 0-1000
 * 
 */
public class prime {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			if (Utility.isPrime(i))
				System.out.print(i + ",");
		}

	}

}
