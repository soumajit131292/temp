package com.BridgeLabz.Programming.oops.jsoninventory.model;

public class Inventory {

	private String name;
	private double weight;
	private double price;

	// Getter Methods
	
	public Inventory(String name,double weight,double price)
	{
		this.name=name;
		this.weight=weight;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	// Setter Methods

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}