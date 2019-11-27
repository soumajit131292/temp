package com.bridgelabz.cliniquemanagement.service;

import java.io.IOException;

public interface PatientInt {

	public void fileRead() ;
	public void addPatients() throws Exception;
	public void appointmentPatients(String name, int id, int mobilenumber, int age) throws Exception;
	public void searchPatients(String name, int id, int mobilenumber, int age);
	public boolean searchPatients(String name);
	public void writefile() throws IOException;
	public boolean searchPatients(int id);
	
}
