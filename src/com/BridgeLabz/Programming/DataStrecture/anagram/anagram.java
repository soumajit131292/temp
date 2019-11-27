package com.BridgeLabz.Programming.DataStrecture.anagram;

/*
 * this program stores the numbers to a an 2d array which are not anagram as well as palindrome and also stores the remainig palindrome number
 * 
 * */
import java.util.ArrayList;
import java.util.List;

public class anagram {

	public static boolean findPrime(int n) {/* this method is used to check whether a nmber is prime or not */
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count == 2;

	}

	public static int reverse(int number) { /* this method is used to reverse the number */
		int rem = 0;
		int newnumber = 0;
		while (number != 0) {
			rem = number % 10;
			newnumber = newnumber * 10 + rem;
			number = number / 10;
		}
		return newnumber;
	}

	public static List<Integer> anagram(List<Integer> list) {
		List<Integer> anagramlist = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			int anagramnumber = reverse(temp);
			if (list.contains(anagramnumber))
				anagramlist.add(temp);

		}
		return anagramlist;

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int[][] anagram = new int[10][100];
		int[][] nonanagram = new int[10][100];
		int number = 0;
		for (int i = 0; i <= 1000; i++) {

			if (findPrime(number))
				list.add(number);
			number++;

		}
		List<Integer> anagramchecked = anagram(list);
		int rangeofnumber = 0; /*
								 * take a number and checks whether it is in the list,if yes put it on anagram
								 * array else put it on nonanagram array
								 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (anagramchecked.contains(rangeofnumber)) {
					anagram[i][j] = rangeofnumber;

				} else {
					nonanagram[i][j] = rangeofnumber;

				}
				rangeofnumber++;

			}
		}
		System.out.println("\nanagram matrix\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (anagram[i][j] > 0)
					System.out.print(anagram[i][j] + ",");

			}
			System.out.print("\n");
		}
		System.out.println("\nnonanagram matrix\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (nonanagram[i][j] > 0)
					System.out.print(nonanagram[i][j] + ",");

			}
			System.out.print("\n");
		}

	}

}
