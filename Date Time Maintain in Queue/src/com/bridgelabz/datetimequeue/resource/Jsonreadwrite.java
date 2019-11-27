package com.bridgelabz.datetimequeue.resource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.datetimequeue.model.Bought;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Jsonreadwrite {

	ObjectMapper mapper = new ObjectMapper();
	String path = "C:\\Users\\souma\\eclipse-workspace\\Date Time Maintain in Queue\\src\\com\\bridgelabz\\datetimequeue\\resource\\writejack.json";

	public ArrayList<Bought> readjson() throws Exception {

		return mapper.readValue(new File(path), new TypeReference<List<Bought>>() {
		});

	}

}