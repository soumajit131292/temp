package com.BridgeLabz.Programming.oops.regex.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.BridgeLabz.Programming.Algorithm.Input;

public class Regexpatterniml implements RegexIntr{

	String firstname,fullname,mobilenumber;
	String date=LocalDate.now().toString();
	String text;
	private String NAME = "<<name>>";
	private String FULLNAME = "<<full name>>";
	private String CONTACT_NO = "<<91-xxxxxxxxxx>>";
	private String DATE = "<<01/01/2016>>";

	
	public void getValidateData()
	{
		boolean checkresult=false;
		do {
			System.out.println("enter first name");
			firstname=Input.inputString();
			checkresult=firstname.matches("^[a-zA-Z]*$");
			
		}while(!checkresult);
		boolean checkresult2=false;
		do {
			System.out.println("enter mobile number");
			mobilenumber=Input.inputString();
			checkresult2=Pattern.matches("[789]{1}[0-9]{9}",mobilenumber);
		}while(!checkresult2);
		boolean checkresult3=false;
		do {
			System.out.println("enter full name");
			fullname=Input.inputString();
			checkresult3=Pattern.matches("^[A-Za-z\\s]+$",fullname);
		}while(!checkresult3);
		
		
	}
	public void replaceData() throws Exception
	{
		File file=new File("C:\\Users\\souma\\current\\src\\com\\BridgeLabz\\Programming\\oops\\regex\\resources\\text.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line=br.readLine();
		StringBuilder sb=new StringBuilder();
		while(line!=null)
		{
			sb.append(line);
			line=br.readLine();
		}
		
		
		 text=sb.toString();
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher matcher = pattern.matcher(text);
		text = matcher.replaceAll(firstname);

		pattern = Pattern.compile(FULLNAME);
		matcher = pattern.matcher(text);
		text = matcher.replaceAll(fullname);

		pattern = Pattern.compile(CONTACT_NO);
		matcher = pattern.matcher(text);
		text = matcher.replaceAll(mobilenumber);

		pattern = Pattern.compile(DATE);
		matcher = pattern.matcher(text);
		
		text = matcher.replaceAll(date);

	}
	public void displayDta() throws Exception
	{
		System.out.println(text);
		
		
	}

	
}
