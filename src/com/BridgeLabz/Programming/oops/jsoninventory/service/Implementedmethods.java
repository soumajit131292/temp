package com.BridgeLabz.Programming.oops.jsoninventory.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.BridgeLabz.Programming.function.InputUtility;

public class Implementedmethods implements Methodsused {

	@SuppressWarnings("unchecked")
	public void writeToJson() throws Exception {

		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();

		JSONObject obj1 = new JSONObject();
		obj1.put("name", InputUtility.inputString());
		obj1.put("weight", InputUtility.inputString());
		obj1.put("price", InputUtility.inputString());

		obj.put("Rice", obj1);

		JSONObject obj2 = new JSONObject();
		obj2.put("name", InputUtility.inputString());
		obj2.put("weight", InputUtility.inputString());
		obj2.put("price", InputUtility.inputString());
		obj.put("Wheat", obj2);
		JSONObject obj3 = new JSONObject();
		obj3.put("name", InputUtility.inputString());
		obj3.put("weight", InputUtility.inputString());
		obj3.put("price", InputUtility.inputString());

		obj.put("pulses", obj3);
		array.add(obj1);
		array.add(obj2);
		array.add(obj3);

		try (PrintWriter file = new PrintWriter(
				"C:\\Users\\souma\\current\\src\\com\\BridgeLabz\\Programming\\oops\\jsoninventory\\resources\\jsonsimple.json")) {
			file.write(obj.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public void readJson() throws Exception {

		Object object = new JSONParser().parse(new FileReader(
				"C:\\Users\\souma\\current\\src\\com\\BridgeLabz\\Programming\\oops\\jsoninventory\\resources\\jsonsimple.json"));

		JSONObject jsonobj = (JSONObject) object;

		
		Map rice = (HashMap) (jsonobj.get("Rice"));
		Iterator<Map.Entry> it1 = rice.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pair = it1.next();
			System.out.println(pair.getKey() + "  " + pair.getValue());
		}
		Map wheat = (HashMap) (jsonobj.get("Wheat"));
		Iterator<Map.Entry> it2 = rice.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pair2 = it2.next();
			System.out.println(pair2.getKey() + "  " + pair2.getValue());
		}
		Map pulses = (HashMap) (jsonobj.get("Pulses"));
		Iterator<Map.Entry> it3 = rice.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pair3 = it3.next();
			System.out.println(pair3.getKey() + "  " + pair3.getValue());
		}

	}

}
