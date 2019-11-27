package com.BridgeLabz.Programming.DataStrecture.hashing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.BridgeLabz.Programming.function.InputUtility;


/**
 * @author soumajit
 *
 *hashing function
 *
 */
public class hashing {

	static linkedlist[] hash = new linkedlist[11];

	public void dataToLinklist(int number) { /*sending data in each blocks*/

		int pos = number % 11;
		if (hash[pos] == null) {

			hash[pos] = new linkedlist();
			hash[pos].insert(number);
		} else
			hash[pos].insert(number);

	}

	public void search(int number) {/*searching data*/

		int pos = number % 11;
		if (hash[pos] != null) {
	
			hash[pos].search(number);
		
		} else
			dataToLinklist(number);

	}

	public static void main(String[] args) {

		try {
			hashing obj = new hashing();
			File file = new File(
					"/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/BridgeLabz/Programming/DataStrecture/hashing/numbers.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			StringBuilder sb = new StringBuilder();
			String str = br.readLine();
			while (str != null) {
				sb.append(str);
				str = br.readLine();
			}
			String result = sb.toString();
			String[] resultarray = result.split(",");

			int[] int_number_array = new int[resultarray.length];
			for (int i = 0; i < int_number_array.length; i++) {
				int_number_array[i] = Integer.parseInt(resultarray[i]);
			}

			for (int j = 0; j < int_number_array.length; j++) {
				obj.dataToLinklist(int_number_array[j]);
			}

			for (int i = 0; i < hash.length; i++) {
				if (hash[i] != null) {
					System.out.print(i + "   ");
					hash[i].show();
				}
				else
					System.out.print(i + "   ");
				System.out.println(" ");
			}

			System.out.println("enter a number");
			int searchkey = InputUtility.inputInteger();
			obj.search(searchkey);
			
			
			for (int i = 0; i < hash.length; i++) {
				if (hash[i] != null) {
					System.out.print(i + "   ");
					hash[i].show();
				}
				else
					System.out.print(i + "   ");
				System.out.println(" ");
			}
		}

		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}