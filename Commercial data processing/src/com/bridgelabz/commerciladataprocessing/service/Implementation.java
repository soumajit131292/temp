package com.bridgelabz.commerciladataprocessing.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.commerciladataprocessing.model.Bought;
import com.bridgelabz.commerciladataprocessing.model.CompanyShares;
import com.bridgelabz.commerciladataprocessing.utility.Utility;
import com.google.gson.Gson;

public class Implementation implements Interfaces{

	JSONObject jsonobj = new JSONObject();
	JSONArray jsonarray = new JSONArray();
	ArrayList<Bought> userlist = new ArrayList<>();
	ArrayList<CompanyShares> companylist = new ArrayList<>();
	JSONParser parser = new JSONParser();

	public void jsonReadUser() {

		try {

			jsonarray = (JSONArray) parser.parse(new FileReader(
					"C:\\Users\\souma\\eclipse-workspace\\Commercial data processing\\src\\com\\bridgelabz\\commerciladataprocessing\\resource\\writejack.json"));
			for (Object obj : jsonarray) {
				jsonobj = (JSONObject) obj;
				String stockChanges = (String) jsonobj.get("stockChanges");

				String stockName = (String) (jsonobj.get("stockName"));

				int shareNumber = ((Long) jsonobj.get("shareNumber")).intValue();

				int sharePrice = ((Long) jsonobj.get("sharePrice")).intValue();
				System.out.println("hello");
				String date = (String) jsonobj.get("date");
				

				String time = (String) jsonobj.get("time");
				
				Bought userbought = new Bought(stockChanges, stockName, shareNumber, sharePrice,date,time);
				userlist.add(userbought);

			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void jsonReadCompany() {

		try {

			jsonarray = (JSONArray) parser.parse(new FileReader(
					"C:\\Users\\souma\\eclipse-workspace\\Commercial data processing\\src\\com\\bridgelabz\\commerciladataprocessing\\resource\\jsonfile.json"));
			for (Object obj : jsonarray) {
				jsonobj = (JSONObject) obj;

				String stockName = (String) jsonobj.get("stockName");
				Long shareNumber1 = ((Long) jsonobj.get("shareNumber"));
				int shareNumber = shareNumber1.intValue();
			

				int sharePrice = ((Long) jsonobj.get("sharePrice")).intValue();
			

				CompanyShares companyshare = new CompanyShares(stockName, shareNumber, sharePrice);
				companylist.add(companyshare);
			}
			//System.out.println(companylist.toString());

		} catch (Exception e) {
			 System.out.println(e.getLocalizedMessage());
		}

	}

	public void writeUser() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(userlist);
			FileWriter filewrite = new FileWriter(
					"C:\\\\Users\\\\souma\\\\eclipse-workspace\\\\Commercial data processing\\\\src\\\\com\\\\bridgelabz\\\\commerciladataprocessing\\\\resource\\\\writejack.json");
			filewrite.write(json);
			filewrite.close();

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void writeCompany() {
		try {
			Gson gson = new Gson();
			String json = gson.toJson(companylist);
			FileWriter filewrite = new FileWriter(
					"C:\\Users\\souma\\eclipse-workspace\\Commercial data processing\\src\\com\\bridgelabz\\commerciladataprocessing\\resource\\jsonfile.json");
			filewrite.write(json);
			filewrite.close();

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public void buy() throws Exception {
		jsonReadCompany();
		System.out.println("enter the company name you want to buy share : ");
		String companyname = Utility.inputString();
		System.out.println("enter the share you want to buy : ");
		int amount = Utility.inputInteger();

		// forEach
		CompanyShares share = null;
		for (CompanyShares i : companylist) {
			if (companyname.equals(i.getStockName())) {
				share = i;
				break;
			}

		}

		int shareamount = share.getShareNumber();

		Bought bought = new Bought();
		if (shareamount > amount) {
			int totalamount = shareamount - amount;

			share.setShareNumber(amount);

			bought.setShareNumber(share.getShareNumber());
			bought.setSharePrice(share.getSharePrice());
			bought.setStockChanges("buy");
			bought.setStockName(share.getStockName());
			bought.setLocalTime(LocalTime.now().toString());
			bought.setLocalDate(LocalDate.now().toString());
			userlist.add(bought);

			writeUser();
			save(totalamount, share);

			printReport();

		} else {
			System.out.println("share is not available ");

		}
	}

	public void sell() throws Exception {

		//jsonReadUser();
		jsonReadCompany();

		System.out.println("enter the company name you want to sell share : ");
		String companyname = Utility.inputString();
		System.out.println("enter the amount you want to sell : ");
		int amount = Utility.inputInteger();

		Bought bought = new Bought();
		CompanyShares share = null;
		for (CompanyShares i : companylist) {
			if (companyname.equals(i.getStockName())) {
				share = i;
				break;
			}

		}

		int shareamount = share.getShareNumber();

		if (shareamount > amount) {
			int totalamount = shareamount + amount;

			share.setShareNumber(amount);

			bought.setShareNumber(share.getShareNumber());
			bought.setSharePrice(share.getSharePrice());
			bought.setStockChanges("sell");
			bought.setStockName(share.getStockName());
			bought.setLocalTime(LocalTime.now().toString());
			bought.setLocalDate(LocalDate.now().toString());
			userlist.add(bought);

			writeUser();
			save(totalamount, share);

			printReport();

		} else {
			System.out.println("reduce your share amount");

		}

	}

	public void save(int totalvalue, CompanyShares companyshare) {
		companyshare.setShareNumber(totalvalue);

	}

	public void printReport() throws Exception {
		writeCompany();
	}
}
