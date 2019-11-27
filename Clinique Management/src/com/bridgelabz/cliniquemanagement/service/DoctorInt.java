package com.bridgelabz.cliniquemanagement.service;

import com.bridgelabz.cliniquemanagement.model.Doctor;

public interface DoctorInt {

	public void fileRead();
	public void addDoctor();
	public boolean searchDoctor(String name);
	public String AvailablityDoctor(String name);
	public void writefile();
	public Doctor getDoctor(String name);
	
	
}
