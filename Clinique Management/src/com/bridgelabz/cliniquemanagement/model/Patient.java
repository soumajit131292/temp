package com.bridgelabz.cliniquemanagement.model;

import lombok.Data;

@Data
public class Patient {
	
	public Patient()
	{}
	

	public Patient(String name, int id, int mobilenumber, int age) {
		super();
		this.name = name;
		this.id = id;
		this.mobilenumber = mobilenumber;
		this.age = age;
	}
	private String name;
	private int id;
	private int mobilenumber;
	private int age;
	
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
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", mobilenumber=" + mobilenumber + ", age=" + age + "]";
	}

}
