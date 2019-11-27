package com.bridgelabz.commerciladataprocessing.model;

import lombok.ToString;
@ToString
public class Bought {
	
public Bought()
{}
	private String stockChanges;
	private String stockName;
	private int shareNumber;
	private int sharePrice;
	private String date;
	private String time;
	
	public Bought(String stockChanges,String stockName,int shareNumber,int sharePrice,String date,String time)
	{
		 this.stockChanges=stockChanges;
		this.stockName=stockName;
		this.shareNumber=shareNumber;
		this.sharePrice=sharePrice;
		this.date=date;
		this.time=time;
		
	}
public void setLocalTime(String time)
{
	this.time=time;
}
public void setLocalDate(String date)
{
	this.date=date;
			}
	public String getLocalTime() {
		return time;
	}

	

	public String getStockChanges() {
		return stockChanges;
	}

	public String getStockName() {
		return stockName;
	}

	public int getShareNumber() {
		return shareNumber;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public String getDatetime() {
		return date;
	}
	// Setter Methods

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}

	public void setSharePrice(int d) {
		this.sharePrice = d;
	}
	public void setStockChanges(String stockChanges) {
		this.stockChanges = stockChanges;
	}
	public String toString()
	{
		
		return ""+sharePrice;
		
	}

}
