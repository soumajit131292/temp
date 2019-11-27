package com.BridgeLabz.Programming.Algorithm.temperatureconversion;

import com.BridgeLabz.Programming.function.InputUtility;

public class Temperatureconversion {

	public static void celcious() {
		Double celcious;
do {
	System.out.println("enter celcious value: ");
	celcious=InputUtility.inputDouble();
}while(celcious<0.0 && celcious>100.0);

	System.out.println("converted temp"+(celcious*9/5)+32);
	
	}	
	
	public static void farenheite() {
		Double farenhite;
do {
	System.out.println("enter celcious value: ");
	farenhite=InputUtility.inputDouble();
}while(farenhite<32 && farenhite>212);

	System.out.println("converted temp is "+(farenhite-32)*5/9);
	
	}	
	


	public static void main(String[] args) {

		System.out.println("print 2 for celcius and 1 for farenheite : ");
		int choice = InputUtility.inputInteger();
		switch (choice) {
		case 1:
			farenheite();
			break;
		case 2:
			celcious();
			break;
		default:
			break;

		}

	}

}
