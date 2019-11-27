package com.bridgelabz.design;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> emplist;

	public Employee() {
		emplist = new ArrayList<String>();
	}

	public Employee(List<String> list) {
		emplist = list;
	}
	public List<String> getEmployee()
	{
		return emplist;
	}

	public void loadData() {
		emplist.add("hey");
		emplist.add("hello");
		emplist.add("how");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		List<String> temp = new ArrayList<String>();
		for (String string : emplist)
			temp.add(string);
		return new Employee(temp);

	}

}
