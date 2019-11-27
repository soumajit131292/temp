package com.BridgeLabz.Programming.DataStrecture.anagramlinkedlistqueue;

/*
 * this program finds the series of number between 0-1000 which are anagram and palindrome and store in queue
 * 
 * */
import java.util.ArrayList;
import java.util.List;

import com.BridgeLabz.Programming.Algorithm.PalindromeAnagramPrime;
import com.BridgeLabz.Programming.DataStrecture.primenumebr.Primenumber;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> anagramlist = new ArrayList<Integer>();
		Linkedlistqueue<Integer> linkedlist = new Linkedlistqueue<Integer>();
		for (int i = 0; i <= 1000; i++) {
			if (Primenumber.findPrime(i))
				list.add(i);
			//
		}

		anagramlist = PalindromeAnagramPrime.Anagram(list);
		for (int i = 0; i < anagramlist.size(); i++)
			linkedlist.enqueue(anagramlist.get(i));
		linkedlist.show();

	}

}
