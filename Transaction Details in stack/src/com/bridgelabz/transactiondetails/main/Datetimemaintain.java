package com.bridgelabz.transactiondetails.main;


import com.bridgelabz.transactiondetails.service.TransactionMethods;
import com.bridgelabz.transactiondetails.service.TransactionsInStack;

public class Datetimemaintain {

	public static void main(String[] args) throws Exception 
	{
		
		TransactionMethods datetime=new TransactionsInStack();
		datetime.transactionStoreToLinklist();
		
		
	}
	
	
}
