package com.BridgeLabz.Programming.Algorithm;
import java.util.logging.*; 

/**
 * @author soumajit
 *
 *         this program find square root value of a given number
 *
 */
public class Sqrt {
	private static final Logger logger=Logger.getLogger(Sqrt.class.getName());
	public static double sqrt(double c) {
		double t = c;
		double epsilion = 1e-15;

		while (Math.abs(t - c / t) > epsilion * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	public static void main(String[] args) {

	
		double userInput;
		do {
			logger.info("enter value to find square root : ");
			userInput = Input.inputDouble();
		} while (userInput <= 0.0);

		logger.info("result is "+sqrt(userInput));

	}

}
