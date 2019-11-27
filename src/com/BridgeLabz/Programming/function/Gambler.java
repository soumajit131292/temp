package com.BridgeLabz.Programming.function;


/**
 * @author soumajit
 *
 *this program finds the percentage of winning and loosing of the gambler
 */
public class Gambler {

	public static double gen() {
		return Math.random();

	}

	public static void main(String[] args) {

		int stake, goal, time;

		System.out.println("enter the stake ");
		stake = InputUtility.inputInteger();
		System.out.println("enter the goal ");
		goal = InputUtility.inputInteger();
		System.out.println("enter the number of times you want to play ");
		time = InputUtility.inputInteger();

		int win = 0;
		int loss = 0;

		for (int i = 0; i < time; i++) {
			if (stake > 0 && stake < goal) {
				double r = gen();
				if (r > 0.5) {
					stake++;
					win++;
				} else {
					stake--;
					loss++;
				}

			}

		}
		System.out.println(win);
		System.out.println((win * 100.0) / time);
		System.out.println((loss * 100.0) / time);
	}

}