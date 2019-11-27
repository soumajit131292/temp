package com.bridgelabz.cliniquemanagement.model;

import lombok.Data;

@Data
public class Appointment {
	private String date;
	private String doctor;
	private String patient;
public Appointment(String date, String doctor, String patient) {
		
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}
;


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Appointment [doctor=" + doctor + ", patient=" + patient + "]";
	}

}
