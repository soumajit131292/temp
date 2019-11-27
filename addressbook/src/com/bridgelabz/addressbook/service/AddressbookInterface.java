package com.bridgelabz.addressbook.service;

public interface AddressbookInterface {

	public void addFamilyPerson();
	public void editFamilyCity();
	public void deletFamily() throws Exception;
	public void sortZipcodeFamily() throws Exception;
	public void sortLastnameFamily() throws Exception;
	public void show() throws Exception;
	public void writeJson() throws Exception;
	public void readJson();
	
}
