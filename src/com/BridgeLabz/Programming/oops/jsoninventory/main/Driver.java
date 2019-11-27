 package com.BridgeLabz.Programming.oops.jsoninventory.main;

import com.BridgeLabz.Programming.oops.jsoninventory.service.Implementedmethods;
import com.BridgeLabz.Programming.oops.jsoninventory.service.Methodsused;

public class Driver {

	public static void main(String[] args) throws Exception {
       
		Methodsused object=new Implementedmethods();
		object.writeToJson();
		object.readJson();
		

	}

}
