package com.BridgeLabz.Programming.function;

import java.util.*;

/**
 * @author soumajit
 *
 *this program generates distinct cupon
 *
 */
public class Cupon {

	public static int gen(int range) {
		return (int) (Math.random() * range);

	}

	public static void main(String[] args) {

		System.out.println("enter the number of distinct coupons you need : ");
		int range = InputUtility.inputInteger();
		List<Integer> list = new ArrayList<>();
		int count = 0;
		int loop = range;

		while (loop > 0) {
			int random_number = gen(range);

			if (!list.contains(random_number)) {
				list.add(random_number);
				loop--;
			}
			count++;
		}
		System.out.print("total " + count + " random has been generate");

	}

}
