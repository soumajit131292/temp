package com.BridgeLabz.Programming.Algorithm;

/**
 * @author soumajit
 *
 *this program calculate monthly payment of a loan amount
 *
 */
public class Monthlypayment {

	public static void main(String[] args) {
		
		double amount;
		int year;
		double rate;
		do {
			System.out.println("enter the amount");
			amount=Input.inputDouble();
			
		}while(amount<0);
		do {
			System.out.println("enter the year");
			year=Input.inputInteger();
			
		}while(year<=0);
		do {
			System.out.println("enter the rate");
			rate=Input.inputDouble();
			
		}while(rate<0);
		

		Util.monthlyPayment(amount,year,rate);
	}

}
