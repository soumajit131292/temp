package com.BridgeLabz.Programming.Algorithm;

/*
 *find() method searches the number of notes to be returned 
 */

public class VendingMachine {

	public static void find(int[] note, int rupees, int index) {
		if (rupees != 0) {
			if (rupees >= note[index]) {
				int count = rupees / note[index];
				rupees = rupees % note[index];
				System.out.println(note[index] + " " + count);
			}
			index++;
			find(note, rupees, index);
		}

	}

	public static void main(String[] args) {

		int rupees;
		do {
			System.out.println("Enter the amount");
			rupees = Input.inputInteger();
		} while (rupees <= 0);

		int[] note = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		find(note, rupees, 0);

	}

}
