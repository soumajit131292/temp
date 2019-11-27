package com.BridgeLabz.Programming.function;



import java.util.Scanner;

/**
 * @author soumajit
 *
 *this program counts the delay using stopwatch
 */
public class Stopwatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		
		System.out.println("Enter 1st number");
		long start=System.currentTimeMillis();
        int a=sc.nextInt();	
        System.out.println("Enter 2nd number");
		long end=System.currentTimeMillis();
         int b=sc.nextInt();	
        
        long diff=end-start;
        System.out.println(diff+" in milli seconds");
        System.out.println((diff/1000)+" seconds");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			sc.close();
		}
		
		

	}

}
