package com.bridgelabz.stockexchange.service;

import java.util.ArrayList;

import com.bridgelabz.stockexchange.model.Bought;
import com.bridgelabz.stockexchange.model.Singlylinkliststack;
import com.bridgelabz.stockexchange.resources.Jsonreadwrite;

public class Datetimeinqueue extends Bought {

	

	public void datetimeinsertioninqueue()throws Exception  {
		Jsonreadwrite readingjson = new Jsonreadwrite();
		ArrayList<Bought> transaction = readingjson.readjson();
		

		Singlylinkliststack<Bought> linklist = new Singlylinkliststack<>();

		for (Bought i : transaction) {
			linklist.insert(i);
		}

		linklist.show();
		

	}

}
