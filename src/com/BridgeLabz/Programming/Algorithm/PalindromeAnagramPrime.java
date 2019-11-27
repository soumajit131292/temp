package com.BridgeLabz.Programming.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author soumajit
 * 
 *         this program searches a palindrome anagram and prime numbers from a
 *         given set of numbers
 * 
 * 
 *         Anagram method searches for anagram number Palindrome method searches
 *         for palindrome number
 * 
 * 
 *
 */
public class PalindromeAnagramPrime {

	public static List<Integer> Anagram(List<Integer> list) {
		int temp;

		int length = list.size();
		List<Integer> llist = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			int newnumber = 0;
			int number = list.get(i);
			int copy_of_number = number;
			while (number != 0) {
				temp = number % 10;
				newnumber = 10 * newnumber + temp;
				number = number / 10;
			}

			if (list.contains(newnumber)) {

				llist.add(copy_of_number);

			}
		}
		return llist;

	}

	public static List<Integer> Palindrome(List<Integer> a) {

		int n = a.size();
		List<Integer> llist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int new_number = 0;
			int number = a.get(i);
			int copy_of_new_number = number;
			while (number != 0) {
				int temp = number % 10;
				new_number = 10 * new_number + temp;
				number = number / 10;
			}
			if (copy_of_new_number == new_number)
				llist.add(new_number);
		}
		return llist;

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index <= 1000; index++) {
			if (Utility.isPrime(index)) {
				list.add(index);
			}
		}
		List<Integer> llist1 = Anagram(list);

		List<Integer> llist = Palindrome(llist1);

		System.out.print(llist);

	}
}
