package com.bridgelabz.addressbook.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.addressbook.model.FamilyMember;
import com.bridgelabz.addressbook.utility.Utility;
import com.google.gson.Gson;

public class AddressbookImp implements AddressbookInterface {

	ArrayList<FamilyMember> familyarray = new ArrayList<>();

	@Override
	public void addFamilyPerson() {

		System.out.println("enter the firstname of a person");
		String firstname = Utility.inputString();
		System.out.println("enter the lasttname of a person");
		String lastname = Utility.inputString();
		System.out.println("enter the address of a person");
		String address = Utility.inputString();
		System.out.println("enter the zipcode of a person");
		Long zipcode = (long) Utility.inputInteger();
		System.out.println("enter the state of a person");
		String state = Utility.inputString();
		System.out.println("enter the city of a person");
		String city = Utility.inputString();
		System.out.println("enter the phonenumber of a person");
		String phonenumber = Utility.inputString();

		FamilyMember addressbook = new FamilyMember(firstname, lastname, address, city, state, zipcode, phonenumber);

		familyarray.add(addressbook);

	}

	public void show() throws Exception {

		writeJson();
	}

	public void editFamilyCity() {

		System.out.println("enter first name of the family person");
		String firstname = Utility.inputString();
		System.out.println("enter the city");
		String city = Utility.inputString();

		for (FamilyMember i : familyarray) {
			if (i.getFirstname().contentEquals(firstname)) {
				i.setCity(city);

				break;
			}
		}

	}

	public void deletFamily() throws Exception {

		System.out.println("enter the firstname of the family person");
		String firstname = Utility.inputString();

		FamilyMember temp = null;

		for (FamilyMember i : familyarray) {
			if (firstname.equals(i.getFirstname())) {
				temp = i;
				break;
			}
		}

		familyarray.remove(temp);

	}

	Comparator<FamilyMember> com = new Comparator<FamilyMember>() {
		public int compare(FamilyMember o1, FamilyMember o2) {

			if (o1.getZipcode() > (o2.getZipcode()))
				return 1;
			else if (o1.getZipcode() < (o2.getZipcode()))
				return -1;
			else {
				return o1.getFirstname().compareTo(o2.getFirstname());

			}
		}
	};
	Comparator<FamilyMember> com1 = new Comparator<FamilyMember>() {
		public int compare(FamilyMember o1, FamilyMember o2) {

			int result = o1.getLastname().compareTo(o2.getLastname());
			if (result == 0) {
				return o1.getFirstname().compareTo(o2.getFirstname());
			}
			return result;

		}
	};

	public void sortLastnameFamily() throws Exception {

		Collections.sort(familyarray, com1);

	}

	public void sortZipcodeFamily() throws Exception {

		Collections.sort(familyarray, com);

	}

	JSONObject jobject = new JSONObject();

	public void readJson() {

		JSONParser parser = new JSONParser();

		try {
			Object obj1=parser.parse(new FileReader(
					"C:\\\\Users\\\\souma\\\\eclipse-workspace\\\\addressbook\\\\src\\\\com\\\\addressbook\\\\resource\\\\addressbookoffamily.json"));


			JSONArray jsonArray = (JSONArray) obj1;
			for (Object obj : jsonArray) {

				jobject = (JSONObject) obj;
				String firstname = (String) jobject.get("firstname");
				String lastname = (String) jobject.get("lastname");
				String city = (String) jobject.get("city");
				String address = (String) jobject.get("address");
				String state = (String) jobject.get("state");
				String phonenumber = (String) jobject.get("phonenumber");
				Long zipcode = ((Long) jobject.get("zipcode"));

				FamilyMember family = new FamilyMember(firstname, lastname, address, city, state, zipcode, phonenumber);

				familyarray.add(family);

			}

		}

		catch (Exception e) {

			System.out.println(e.getLocalizedMessage());
		}

	}

	public void writeJson() throws Exception {
		String path = "C:\\Users\\souma\\eclipse-workspace\\addressbook\\src\\com\\addressbook\\resource\\addressbookoffamily.json";

		Gson gson = new Gson();

	

		String json = gson.toJson(familyarray);

		FileWriter write = new FileWriter(path);
		write.write(json);
		write.close();

	}

}
