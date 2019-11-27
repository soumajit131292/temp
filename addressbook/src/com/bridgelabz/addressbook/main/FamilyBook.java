package com.bridgelabz.addressbook.main;

import com.bridgelabz.addressbook.service.AddressbookImp;
import com.bridgelabz.addressbook.service.AddressbookInterface;
import com.bridgelabz.addressbook.utility.Utility;

public class FamilyBook {

	public static void main(String[] args) throws Exception {

		int choice;

		
		
		AddressbookInterface addressbookapp = new AddressbookImp();
		

		do {
			System.out.println(
					"1.add family person\nd\n2.edit family city\n3.sort family person last name\n\n4.sort family member zipcode\n\n5.delete family member\n6.show");

			choice = Utility.inputInteger();
			switch (choice) {
			// 1 for add family person
			case 1: {
				addressbookapp.readJson();
				addressbookapp.addFamilyPerson();

				break;

			}

			// edit family person city
			case 2: {

				addressbookapp.editFamilyCity();

				break;

			}

			// sort family person last name
			case 3: {

				addressbookapp.sortLastnameFamily();

				break;

			}

			// sort family member by zipcode
			case 4: {
				addressbookapp.sortZipcodeFamily();

				break;
			}

			// delete family person
			case 5: {

				addressbookapp.deletFamily();

				break;
			}
			case 6:
			{
				addressbookapp.show();
				
				break;
			}
			}
		} while (choice < 7);
		
	}

}


