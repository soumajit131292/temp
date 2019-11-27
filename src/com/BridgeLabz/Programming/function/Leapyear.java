package com.BridgeLabz.Programming.function;

public class Leapyear {

	public static boolean checkleapyear(int year)
	{
		return ((year%4==0 && year%100!=0) || (year %400==0));
			
	}
	public static void main(String[] args) {
		
		int year;
		do {
			System.out.println("enter the month");
			year = InputUtility.inputInteger();
		} while (year<1000);
		if(checkleapyear(year))
		     System.out.println("it's lepa year");
		else
			System.out.println("it's not a lepa year");



	}

}
