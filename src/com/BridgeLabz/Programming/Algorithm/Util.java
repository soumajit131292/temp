package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit
 *
 *         this program takes year,day,month from user and finds day of week
 *
 */
public class Util {
	public static int dayOfWeek(int day, int month, int year) {

		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;

		return ((day + x + 31 * m0 / 12) % 7);

	}

	public static void monthlyPayment(double payment, int year, double intersetrate) {
		int month = 12 * year;
		double monthlyrate = intersetrate / (12.0 + 100.0);
		double monthlypayment = (payment * monthlyrate) / (1 - Math.pow((1 + monthlyrate), (-month)));
		System.out.println("monthlypayment is " + monthlypayment);
	}

}
