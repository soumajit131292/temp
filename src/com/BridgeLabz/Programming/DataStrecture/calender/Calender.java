package com.BridgeLabz.Programming.DataStrecture.calender;
/*
 * 
 * implements calender of each month
 * 
 * */
import com.BridgeLabz.Programming.Algorithm.*;
import com.BridgeLabz.Programming.function.Leapyear;

public class Calender {

	public static void main(String[] args) {
		int month, year;
		String[] day = { "Su", "Mn", "Tu", "We", "Th", "Fr", "Sa" };
		int[] dayofmonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] monthname = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		do {
			System.out.println("enter the month");
			month = Input.inputInteger();
		} while (month <= 0 || month > 12);

		do {
			System.out.println("enter the year");
			year = Input.inputInteger();
		} while (year <= 1751);
/*find the start day of each month*/
		int startday = Util.dayOfWeek(1, month, year);
/*whether a year is lapyear or not*/
		boolean isleapyear = Leapyear.checkleapyear(year);

		int lastdate = dayofmonth[month - 1];
		if (isleapyear)
			lastdate = 29;
		System.out.println(monthname[month - 1] + " " + year);
		for (int i = 0; i < 7; i++) {
			System.out.print(day[i] + "  ");
		}

		System.out.println("\n");

		for (int i = 0; i < startday; i++)
			System.out.print("    ");

		for (int j = 1; j <= lastdate; j++) {
			System.out.print(String.format("%02d", j) + "  ");

			if ((startday + j) % 7 == 0)
				System.out.println("\n");
		}

	}

}
