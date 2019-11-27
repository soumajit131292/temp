package com.BridgeLabz.Programming.oops.ricewheatpulse.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.BridgeLabz.Programming.oops.ricewheatpulse.model.DataManagement;
import com.google.gson.Gson;

public class Implementedmethod implements Methodsused {
	ArrayList<DataManagement> array = new ArrayList<>();
	JSONArray jarray = new JSONArray();
	JSONObject jobject = new JSONObject();
	JSONParser parser = new JSONParser();

	public void dataEntery() throws Exception {

		DataManagement manage1 = new DataManagement();
		manage1.setName("Rice");
		manage1.setPrice(300);
		manage1.setWeight(50);

		array.add(manage1);

		DataManagement manage2 = new DataManagement();
		manage2.setName("wheat");
		manage2.setPrice(170);
		manage2.setWeight(30);

		array.add(manage2);

		DataManagement manage3 = new DataManagement();
		manage3.setName("pulses");
		manage3.setPrice(110);
		manage3.setWeight(40);

		array.add(manage3);

		Gson gson = new Gson();
		FileWriter file = new FileWriter(
				"C:\\Users\\souma\\current\\src\\com\\BridgeLabz\\Programming\\oops\\ricewheatpulse\\resources\\datamanagement.json");
		String json = gson.toJson(array);
		file.write(json);
		file.close();

	}

	public void totalPrice() throws Exception {

		jarray = (JSONArray) parser.parse(new FileReader(
				"C:\\Users\\souma\\current\\src\\com\\BridgeLabz\\Programming\\oops\\ricewheatpulse\\resources\\datamanagement.json"));

		int totalvalue = 0;
		for (Object obj : jarray) {
			jobject = (JSONObject) obj;
			int weight = ((Long) jobject.get("weight")).intValue();
			System.out.println("hello");
			int price = ((Long) jobject.get("price")).intValue();

			System.out.println("in the for loop");
			totalvalue = totalvalue + weight * price;
		}
		System.out.println("the final amount is : " + totalvalue);

	}
}
