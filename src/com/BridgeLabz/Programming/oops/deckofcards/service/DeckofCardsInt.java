package com.BridgeLabz.Programming.oops.deckofcards.service;

import java.util.ArrayList;
import java.util.Random;

public class DeckofCardsInt implements DeckOfCardsInter {

	Random random = new Random();
	String[] Suit = { "Clubs", "Diamond", "Hearts", "Spades" };
	String[] Rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[] playerA = new String[9];
	String[] playerB = new String[9];
	String[] playerC = new String[9];
	String[] playerD = new String[9];

	String[] hold_card = new String[52];

	public void initialize() {

		int k = 0;
		for (int i = 0; i < Suit.length; i++) {
			for (int j = 0; j < Rank.length; j++) {
				hold_card[k++] = Suit[i] + "      " + Rank[j];
			}

		}

	}

	public void shuffling()
	{
	 
		int i = 0;
		int generate = 0;
		ArrayList<Integer> number = new ArrayList<>();
		while (i < 9) {

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			playerA[i] = hold_card[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			playerB[i] = hold_card[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			playerC[i] = hold_card[generate];
			number.add(generate);

			do {
				generate = random.nextInt(52);
			} while (number.contains(generate));
			playerD[i] = hold_card[generate];
			number.add(generate);

			i++;
		}
	}

		public void display()
		{
			System.out.println("\n");
			System.out.println("For playerA\n");
			for (int j = 0; j < 9; j++) {
				System.out.println(playerA[j]);
			}
			System.out.println("\n");
			System.out.println("For playerB\n");
			for (int j = 0; j < 9; j++) {
				System.out.println(playerB[j]);
			}
			System.out.println("\n");

			System.out.println("For playerC\n");
			for (int j = 0; j < 9; j++) {
				System.out.println(playerC[j]);
			}
			System.out.println("\n");

			System.out.println("For playerD\n");
			for (int j = 0; j < 9; j++) {
				System.out.println(playerD[j]);
			}

		}
		
	}

