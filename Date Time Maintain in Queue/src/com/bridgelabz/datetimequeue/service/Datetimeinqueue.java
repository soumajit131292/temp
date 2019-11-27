package com.bridgelabz.datetimequeue.service;

import java.util.ArrayList;

import com.bridgelabz.datetimequeue.model.Bought;
import com.bridgelabz.datetimequeue.model.Singlylinkliststack;
import com.bridgelabz.datetimequeue.resource.Jsonreadwrite;

public class Datetimeinqueue implements TransactionMethods {

	

	public void datetimeinsertioninqueue() throws Exception {
		Jsonreadwrite readingjson = new Jsonreadwrite();
		ArrayList<Bought> transaction = readingjson.readjson();

		Singlylinkliststack<Bought> linklist = new Singlylinkliststack<>();

		for (Bought i : transaction) {
			linklist.insert(i);
		}

		linklist.show();

	}

}
