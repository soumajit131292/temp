package com.BridgeLabz.Programming.Algorithm;


/**
 * @author soumajit
 *
 *it finds day of week from a given date
 */
public class DayOfWeek {

	public static void main(String[] args) {

		int month, day, year;
		
		do {
			System.out.println("enter the month");
			month = Input.inputInteger();
		} while (month <= 0 || month > 12);

		do {
			System.out.println("enter the date");
			day = Input.inputInteger();
		} while (day <= 0 || day > 31);

		do {
			System.out.println("enter the year");
			year = Input.inputInteger();
		} while (year <= 1751);
		
		day=Util.dayOfWeek(day,month,year);
		
		if (day==0)
			System.out.println("Sunday");
		if (day == 1)
			System.out.println("Monday");

		if (day == 2)
			System.out.println("Tuesday");

		if (day == 3)
			System.out.println("Wednesday");

		if (day == 4)
			System.out.println("Thursday");

		if (day == 5)
			System.out.println("Friday");

		if (day == 6)
			System.out.println("Saturday");
		
		
		

	}

}
