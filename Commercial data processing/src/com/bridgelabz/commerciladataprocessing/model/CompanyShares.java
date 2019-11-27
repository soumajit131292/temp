package com.bridgelabz.commerciladataprocessing.model;

public class CompanyShares {

	private String stockName;
	private int shareNumber;
	private int sharePrice;
	
	@Override
	public String toString() {
		return "CompanyShares [stockName=" + stockName + ", shareNumber=" + shareNumber + ", sharePrice=" + sharePrice
				+ "]";
	}
	
	public CompanyShares(String stockName,int shareNumber,int sharePrice)
	{
		this.stockName=stockName;
		this.shareNumber=shareNumber;
		this.sharePrice=sharePrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getShareNumber() {
		return shareNumber;
	}

	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
}
