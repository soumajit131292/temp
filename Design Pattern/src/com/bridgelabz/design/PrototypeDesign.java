package com.bridgelabz.design;

import java.util.List;

public class PrototypeDesign {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		
		Employee emp=new Employee();
		emp.loadData();
		
		Employee emp1=(Employee) emp.clone();
		Employee emp2=(Employee) emp1.clone();
		
		List<String> employee1=emp1.getEmployee();
		employee1.remove("hey");
		
		System.out.println(employee1);
		System.out.println(emp.getEmployee());
		
		

	}

}
