package com.BridgeLabz.Programming.DataStrecture.unorderlist;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.BridgeLabz.Programming.Algorithm.Input;

public class UnOrderedList {

	public static void main(String[] args) {
		try {
			File file = new File("/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/BridgeLabz/Programming/DataStrecture/unorderlist/words.txt");

			StringBuilder stringbuild = new StringBuilder();
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				stringbuild.append(scanner.next());
			}
			scanner.close();
			UnorderedLinkedList<String> list=new UnorderedLinkedList<>();
			String string = stringbuild.toString();
			String[] words = string.split(",");
			for (int i = 0; i < words.length; i++) {
				list.creation(words[i]);

			}
		list.view();

			String searchword = Input.inputString();
			list.search(searchword);
			FileWriter fw = new FileWriter(
					"/home/soumajit/Desktop/pendrive/workspace/BridgeLabz/src/com/BridgeLabz/Programming/DataStrecture/unorderlist/words.txt");
			list.writeToFile(fw);

			/*
			 * { filewriter.write(searchword); filewriter.flush(); filewriter.close(); }
			 */

		} catch (Exception e) {
			System.out.println("no file found");
		}
	}

}
