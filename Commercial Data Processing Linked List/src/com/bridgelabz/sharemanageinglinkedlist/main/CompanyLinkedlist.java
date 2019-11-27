package com.bridgelabz.sharemanageinglinkedlist.main;

import com.bridgelabz.sharemanageinglinkedlist.myexception.MyException;
import com.bridgelabz.sharemanageinglinkedlist.service.Methods;

public class CompanyLinkedlist {

	public static void main(String[] args) throws MyException{

		try {
			new Methods().addDeletToLinkeedList();
			throw new MyException("no such file is there");
		} catch (Exception e) {
			System.out.println("no such file is there");
		}

	}

}