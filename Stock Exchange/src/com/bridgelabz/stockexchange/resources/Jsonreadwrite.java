package com.bridgelabz.stockexchange.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.stockexchange.model.Bought;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonreadwrite {

	ObjectMapper mapper = new ObjectMapper();
	String path = "/home/admin1/current/Bridgelabz/src/com/bridgelabz/datetime/implementation/writejack.json";

	public ArrayList<Bought> readjson() throws Exception {

		return mapper.readValue(new File(path), new TypeReference<List<Bought>>() {
		});

	}

}