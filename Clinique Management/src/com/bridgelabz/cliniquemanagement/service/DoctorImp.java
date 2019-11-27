package com.bridgelabz.cliniquemanagement.service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.cliniquemanagement.model.Doctor;
import com.bridgelabz.cliniquemanagement.util.Utility;
import com.google.gson.Gson;

public class DoctorImp implements DoctorInt{

	JSONArray jsonArray;
	List<Doctor> doctorarray = new ArrayList<>();

	JSONObject jobject = new JSONObject();
	

	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
			try {
				File file = new File("C:\\Users\\souma\\eclipse-workspace\\Clinique Management\\src\\com\\bridgelabz\\cliniquemanagement\\resources\\Doctorlist.json");

				FileReader fileReader = new FileReader(file);

				jobject = (JSONObject) parser.parse(fileReader);

				jsonArray = (JSONArray) jobject.get("Doctor");

				for (Object obj : jsonArray) {

					Doctor doctor = new Doctor();

					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					int id = ((Long) jobject.get("id")).intValue();
					String spe = (String) jobject.get("specilization");
					String ava = (String) jobject.get("availability");

					doctor.setId(id);
					doctor.setName(name);
					doctor.setAvailability(ava);
					doctor.setSpecialization(spe);

					doctorarray.add(doctor);

					doctor.toString();
				}
			}

			catch (Exception e) {
				
				System.out.println(e.getLocalizedMessage());

			}

		}

	}

	


	@Override
	public void addDoctor() {
		System.out.println("enter doctor name");
		String name=Utility.inputString();
		System.out.println("enter doctor availablity");
		String availability=Utility.inputString();
		System.out.println("enter doctor specialization");
		String specialization=Utility.inputString();
		System.out.println("enter doctor id");
		int id=Utility.inputInteger();
		
		Doctor doctor = new Doctor();

		doctor.setName(name);
		doctor.setAvailability(availability);
		doctor.setId(id);
		doctor.setSpecialization(specialization);

		doctorarray.add(doctor);

	
		writefile();
	}

	//@Override
	public boolean searchDoctor(String name) {
		for (Doctor doctor : doctorarray) {
			if (name.equals(doctor.getName())) {
				return true;
	
		}
		
	}
		return false;
	}

	@Override
	public String AvailablityDoctor(String name) {
		String time = "";

		for (Doctor availability : doctorarray) {
			if (searchDoctor(name) == true) {
				time = availability.getAvailability();
			}
		}
		return time;
	}

	@Override
	public void writefile() {
		Gson gson = new Gson();
		String json = gson.toJson(doctorarray);

		try (FileWriter file = new FileWriter("C:\\Users\\souma\\eclipse-workspace\\Clinique Management\\src\\com\\bridgelabz\\cliniquemanagement\\resources\\Doctorlist.json")) {
			file.write("{\"Doctor\": " + json + "}");
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Doctor getDoctor(String name) {
		Doctor doct=null;
		for (Doctor doctor : doctorarray) {
			if (name.equals(doctor.getName())) {
				doct=doctor;
				break;
			}
		}
		return doct;
	}

	
	
	
}
