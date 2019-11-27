package com.bridgelabz.transactiondetails.service;

import java.util.ArrayList;

import com.bridgelabz.transactiondetails.model.Bought;
import com.bridgelabz.transactiondetails.model.Singlylinkliststack;
import com.bridgelabz.transactiondetails.resources.Jsonreadwrite;

public class TransactionsInStack implements TransactionMethods {

	public void transactionStoreToLinklist() throws Exception {
		Jsonreadwrite readingjson = new Jsonreadwrite();
		ArrayList<Bought> transaction=readingjson.readjson();
		
		Singlylinkliststack<Bought> linklist = new Singlylinkliststack<>();

		for (Bought i : transaction) {
			linklist.insert(i);
		}

		linklist.show();

	}


}
