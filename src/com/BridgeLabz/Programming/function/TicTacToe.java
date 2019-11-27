package com.BridgeLabz.Programming.function;

import java.util.Random;

/**
 * @author soumajit
 *
 * this is a implement of tic tac toe game
 */
public class TicTacToe {
	public static int[][] array(int[][] a) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < 0)
					System.out.print("-");
				else if (a[i][j] == 1)
					System.out.print("X");
				else
					System.out.print("O");
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		return a;
	}

	public static boolean win(int[][] a) {
		if (a[0][0] == a[0][1] && a[0][1] == a[0][2])
			return true;
		if (a[0][0] == a[1][0] && a[1][0] == a[2][0])
			return true;
		if (a[0][1] == a[1][1] && a[1][1] == a[2][1])
			return true;
		if (a[1][0] == a[1][1] && a[1][1] == a[1][2])
			return true;
		if (a[0][2] == a[1][2] && a[1][2] == a[2][2])
			return true;
		if (a[2][0] == a[2][1] && a[2][1] == a[2][2])
			return true;
		if (a[0][0] == a[1][1] && a[1][1] == a[2][2])
			return true;
		if (a[0][2] == a[1][1] && a[1][1] == a[2][0])
			return true;

		return false;
	}

	public static void main(String[] args) {

		Random rd = new Random();

		int count = 0;
		int flag = 0;
		
		int[][] a = new int[3][3];
		int value = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = value;
				value--;
			}
		}

		while (count < 9) {
			int row, col;
			do {
				System.out.println("enter postion for row and column : ");
				row = InputUtility.inputInteger();
				col = InputUtility.inputInteger();
			} while (a[row][col] > 0);

			a[row][col] = 1;
			count++;
			if (win(a)) {
				flag = 1;
				break;
			}
			int r, c;
			do {

				r = rd.nextInt(3);
				c = rd.nextInt(3);
			} while (a[r][c] > 0);

			a[r][c] = 2;
			count++;
			array(a);
			if (win(a)) {
				flag = 0;
				break;
			}

		}
		if (flag == 1)
			System.out.println("USER WON ");
		if (flag == 0)
			System.out.println("COMPUTER WON ");
		if (!win(a))
			System.out.println("MATCH TIED ");

	}

}
