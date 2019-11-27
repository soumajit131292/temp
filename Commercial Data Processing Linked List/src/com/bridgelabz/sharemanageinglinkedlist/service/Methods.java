package com.bridgelabz.sharemanageinglinkedlist.service;

import java.util.List;

import com.bridgelabz.sharemanageinglinkedlist.model.CompanyShares;
import com.bridgelabz.sharemanageinglinkedlist.model.UnorderedLinkedList;
import com.bridgelabz.sharemanageinglinkedlist.utility.Utility;



public class Methods {

	public void addDeletToLinkeedList() throws Exception {
		ReadWrite jsonread = new ReadWrite();
		UnorderedLinkedList<CompanyShares> linklist = new UnorderedLinkedList<>();

		List<CompanyShares> listofshare = jsonread.readJson();

		for (CompanyShares i : listofshare)
			linklist.creation(i);
		linklist.view();
		System.out.println("Enter the position ");
		int pos =Utility.inputInteger();
		linklist.delet(pos);

		linklist.view();

	}

}
