package com.bridgelabz.cliniquemanagement.service;

import java.util.List;

import com.bridgelabz.cliniquemanagement.model.Appointment;

public interface AppointInt {
	
	//public Doctor searchDoctorByName(String doctorName);
	//public Doctor searchDoctorBySpec(String spec);
	public boolean canTakeAppointment(String doctor, String date);
	public void takeAppointment();
	public List<Appointment> readFile();
	

}
