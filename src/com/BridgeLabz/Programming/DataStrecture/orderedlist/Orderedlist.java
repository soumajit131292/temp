package com.BridgeLabz.Programming.DataStrecture.orderedlist;

import java.io.BufferedReader;
/*
 * 
 * ordered linkedlist
 * 
 * 
 * 
 * */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.BridgeLabz.Programming.function.InputUtility;

public class Orderedlist {

	public static void main(String[] args) {
		try {
			File file = new File(
					"/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/BridgeLabz/Programming/DataStrecture/orderedlist/numbers.txt");
			Scanner scanner = new Scanner(file);
			BufferedReader br = new BufferedReader(new FileReader(file));
			StringBuilder stringbuilder = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				stringbuilder.append(line);
				line = br.readLine();
			}
			Orderedlinklist<Integer> obj = new Orderedlinklist<Integer>();
			String str = stringbuilder.toString();

			String[] temp = str.split(",");
			int[] resultarray = new int[temp.length];
			for (int i = 0; i < temp.length; i++) {
				resultarray[i] = Integer.parseInt(temp[i]);

			}

			for (int i = 0; i < resultarray.length; i++) {
				obj.creation(resultarray[i]);
			}

			obj.view();
			System.out.println("after sorting");
			obj.sort();
			obj.view();
			Integer searchkey = InputUtility.inputInteger();
			obj.intsearch(searchkey);
			FileWriter fw = new FileWriter(
					"/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/BridgeLabz/Programming/DataStrecture/orderedlist/numbers.txt");
			obj.writeToFile(fw);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
