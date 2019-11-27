package com.BridgeLabz.Programming.DataStrecture.anagramlinkedliststack;

/*
 * this program implements prime anagram numbers using stack 
 * 
 * */


import com.BridgeLabz.Programming.DataStrecture.primenumebr.*;

public class Driver {

	public static void main(String[] args) {

		Linkedlist<Integer> list = new Linkedlist<>();
		for (int i = 0; i <= 1000; i++) {
			if (Primenumber.findPrime(i))
				list.insert(i);
		}
		list.show();

	}

}
