package com.bridgelabz.transactiondetails.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.transactiondetails.model.Bought;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Jsonreadwrite {

	ObjectMapper mapper = new ObjectMapper();
	String path = "C:\\Users\\souma\\eclipse-workspace\\Transaction Details in stack\\src\\com\\bridgelabz\\transactiondetails\\resources\\writejack.json";

	public ArrayList<Bought> readjson() throws Exception {

		return mapper.readValue(new File(path), new TypeReference<List<Bought>>() {
		});

	}

}