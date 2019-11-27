package com.bridgelabz.datetimequeue.main;

import com.bridgelabz.datetimequeue.service.Datetimeinqueue;
import com.bridgelabz.datetimequeue.service.TransactionMethods;

public class Datetimemaintain {

	public static void main(String[] args) throws Exception 
	{
		
		TransactionMethods datetime=new Datetimeinqueue();
		datetime.datetimeinsertioninqueue();
		
		
	}
	
	
}
