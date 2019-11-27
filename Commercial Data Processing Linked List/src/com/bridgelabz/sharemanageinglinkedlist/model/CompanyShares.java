package com.bridgelabz.sharemanageinglinkedlist.model;

public class CompanyShares implements Comparable{

	
		
	private String stockname;
	private int sharenumber;
	private double shareprice;
	

	// Getter Methods


	public String getStockname() {
		return stockname;
	}

	public int getSharenumber() {
		return sharenumber;
	}

	public double getShareprice() {
		return shareprice;
	}

	// Setter Methods

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public void setSharenumber(int sharenumber) {
	   this.sharenumber = sharenumber;
	}

	public void setShareprice(double shareprice) {
		this.shareprice = shareprice;
	}
	
	public String toString()
	{
		return stockname+"  "+sharenumber+"  "+shareprice;
	}

	@Override
	public int compareTo(Object arg0) {
	
		return 0;
	}

	
	
}
