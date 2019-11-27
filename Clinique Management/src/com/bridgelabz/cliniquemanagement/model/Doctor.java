package com.bridgelabz.cliniquemanagement.model;

import lombok.Data;

@Data

public class Doctor {

	private String name;
	private int id;
	private String specialization;
	private String availability;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availability="
				+ availability + "]";
	}
	

}
