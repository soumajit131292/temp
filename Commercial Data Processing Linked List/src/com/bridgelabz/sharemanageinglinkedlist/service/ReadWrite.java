package com.bridgelabz.sharemanageinglinkedlist.service;

import java.io.File;
import java.util.List;

import com.bridgelabz.sharemanageinglinkedlist.model.CompanyShares;
import com.bridgelabz.sharemanageinglinkedlist.model.UnorderedLinkedList;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadWrite {

	ObjectMapper mapper = new ObjectMapper();

	private String writeurl = "C:\\Users\\souma\\eclipse-workspace\\Commercial Data Processing Linked List\\src\\com\\bridgelabz\\sharemanageinglinkedlist\\resources\\linklist.json";
	private String readurl = "C:\\Users\\souma\\eclipse-workspace\\Commercial Data Processing Linked List\\src\\com\\bridgelabz\\sharemanageinglinkedlist\\resources\\jsonfile.json";

	public void writeJson(UnorderedLinkedList<CompanyShares> array) throws Exception {

		mapper.writeValue(new File(writeurl), array);
	}

	public List<CompanyShares> readJson() throws Exception {
		return mapper.readValue(new File(readurl), new TypeReference<List<CompanyShares>>() {
		});

	}
}