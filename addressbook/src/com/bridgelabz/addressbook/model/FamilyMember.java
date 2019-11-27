package com.bridgelabz.addressbook.model;

public class FamilyMember{

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private Long zipcode;
	private String phonenumber;
	
	public FamilyMember()
	{
		
	}
	
	public FamilyMember(String firstname,String lastname,String address,String city,String state,Long zipcode,String phonenumber)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.phonenumber=phonenumber;
		
		
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setlasttname(String lasttname) {
		this.lastname = lasttname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String toString() {
		return firstname + " " + lastname + " " + address+"  "+zipcode+"  "+phonenumber+"  "+state+"  "+city;
	}

	

}