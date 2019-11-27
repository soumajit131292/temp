package com.bridgelabz.stockexchange.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Bought {
	

	private String stockChanges;
	private String stockName;
	private int shareNumber;
	private double sharePrice;
	private String localTime;
	private String datetime;


	public String getLocalTime() {
		
		localTime=LocalTime.now().toString();
		return localTime;
	}

	public void setStockChanges(String stockChanges) {
		this.stockChanges = stockChanges;
	}

	public String getStockChanges() {
		return stockChanges;
	}

	public String getStockname() {
		return stockName;
	}

	public int getSharenumber() {
		return shareNumber;
	}

	public double getShareprice() {
		return sharePrice;
	}

	public String getDatetime() {
		datetime=LocalDate.now().toString();
		return datetime;
	}

	public void setStockname(String stockname) {
		this.stockName = stockname;
	}

	public void setSharenumber(int sharenumber) {
		this.shareNumber = sharenumber;
	}

	public void setShareprice(double shareprice) {
		this.sharePrice = shareprice;
	}


	public String toString()
	{
		return "Stock Symbol = "+stockName+"  "+"Stock buy/sell = "+stockChanges;
	}
	

	
	
}
