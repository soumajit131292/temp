package com.BridgeLabz.Programming.Algorithm;

import java.io.File;

public class file {

	public void create(String name) throws Exception{
		File fille=new File(name+".txt");
		if(fille.createNewFile())
			System.out.println("created");
		else
			System.out.println("created");
		}
	public static void main(String[] args)throws Exception {
		String name="helloman"+".txt";
		new file().create("name");

		
		
	}

}
