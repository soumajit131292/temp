package com.BridgeLabz.Programming.Algorithm;

import java.io.PrintWriter;

/**
 * @author soumajit
 *
 *         this program prints boolean type 2D array using printwriter
 *
 */
public class Twodarray {

	public static void main(String[] arg) {

		int row = Input.inputInteger();
		int col = Input.inputInteger();
		boolean[][] array = new boolean[row][col];
		PrintWriter pw = new PrintWriter(System.out);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (Math.random() > 0.5)
					array[i][j] = true;
				else
					array[i][j] = false;
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				pw.print(array[i][j] + " ");
				pw.flush();
			}
			pw.print("\n");
		}
	}
}
