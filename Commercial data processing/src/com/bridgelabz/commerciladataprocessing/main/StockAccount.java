package com.bridgelabz.commerciladataprocessing.main;

import com.bridgelabz.commerciladataprocessing.service.Implementation;
import com.bridgelabz.commerciladataprocessing.service.Interfaces;
import com.bridgelabz.commerciladataprocessing.utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws Exception {

		Interfaces stock = new Implementation();

		int choice = 0;
		do {
			System.out.println("press 1 for enter the share quantity you want to buy  : ");

			System.out.println("press 2 for enter the quantity you want to sell share : ");
			choice = Utility.inputInteger();

			switch (choice) {

			case 1: {

				stock.buy();

				break;
			}
			case 2: {

				stock.sell();

				break;
			}

			default:

				System.out.println("try again");
				break;

			}

		} while (choice < 3);
	}

}
