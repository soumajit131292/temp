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

import com.bridgelabz.cliniquemanagement.model.Patient;
import com.bridgelabz.cliniquemanagement.util.Utility;
import com.google.gson.Gson;

public class PatientImp implements PatientInt{

	JSONArray jsonarray1;
	List<Patient> patients = new ArrayList<>();
	JSONObject jobj1 = new JSONObject();

	@Override
	public void fileRead() {
		JSONParser jp = new JSONParser();
		{
			try {
				File file1 = new File("C:\\Users\\souma\\eclipse-workspace\\Clinique Management\\src\\com\\bridgelabz\\cliniquemanagement\\resources\\Patientlist.json");
				

				FileReader fr = new FileReader(file1);

				jobj1 = (JSONObject) jp.parse(fr);

				jsonarray1 = (JSONArray) jobj1.get("Patients");

				for (Object obj : jsonarray1) {

					Patient p = new Patient();

					jobj1 = (JSONObject) obj;

					String name = (String) jobj1.get("name");
					int id = ((Long) jobj1.get("id")).intValue();
					int mn = ((Long) jobj1.get("mobileNumber")).intValue();
					int age = (((Long) jobj1.get("age")).intValue());

					p.setId(id);
					p.setName(name);
					p.setMobilenumber(mn);
					p.setAge(age);

					patients.add(p);

				
				}
			} catch (Exception e) {

				//throw new CustomException("Exception occured while reading your file", e);

			}
		}

	}

	@Override
	public void addPatients() throws Exception {
		System.out.println("enter doctor name");
		String name=Utility.inputString();
		System.out.println("enter doctor id");
		int id=Utility.inputInteger();
		System.out.println("enter doctor mobilenumber");
		int mobilenumber=Utility.inputInteger();
		System.out.println("enter doctor age");
		int age=Utility.inputInteger();
		Patient pt = new Patient();
		pt.setName(name);
		pt.setId(id);
		pt.setMobilenumber(mobilenumber);
		pt.setAge(age);
		//patients.forEach(patient1 -> System.out.println(patient1.toString()));
		
		patients.add(pt);
		writefile();
		//System.out.println(patients);
		
	}

	public void writefile() throws IOException
	{
		/*Gson gson=new Gson();
		String path="C:\\Users\\souma\\eclipse-workspace\\Clinique Management\\src\\com\\bridgelabz\\cliniquemanagement\\resources\\Patientlist.json";
		String json1=gson.toJson(patients);
		
		FileWriter writer=new FileWriter(path);

		
		System.out.println("SuccessFully copied to JSON  Object to File......");
		writer.write("{\"Doctor\": " + json1 + "}");*/
		Gson gson = new Gson();
		String json = gson.toJson(patients);
		//System.out.println(patients);

		try (FileWriter file = new FileWriter("C:\\\\Users\\\\souma\\\\eclipse-workspace\\\\Clinique Management\\\\src\\\\com\\\\bridgelabz\\\\cliniquemanagement\\\\resources\\\\Patientlist.json")) {
			file.write("{\"Patients\": " + json + "}");
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	public void appointmentPatients(String name, int id, int mobilenumber, int age) throws Exception{

		Patient patient=new Patient(name,id,mobilenumber,age);
		patients.add(patient);
		writefile();
		
	}

	@Override
	public void searchPatients(String name, int id, int mobilenumber, int age) {
		
     
		
		
	}

	@Override
	public boolean searchPatients(String name) {
		
     for(Patient patientsearch : patients)
     {
    	 if(patientsearch.getName().equals(name))
              {
                 return true; 
                  
    		      
	          }
     }
		return false;
    
	}
	@Override
	public boolean searchPatients(int id) {
		
	     for(Patient patientsearch : patients)
	     {
	    	 if(patientsearch.getId()==id)
	              {
	                 return true; 
	                  
	    		      
		          }
	     }
			return false;
	    
		}
	
}
