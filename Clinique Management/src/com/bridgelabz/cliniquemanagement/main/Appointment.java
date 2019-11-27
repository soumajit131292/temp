package com.bridgelabz.cliniquemanagement.main;

import com.bridgelabz.cliniquemanagement.service.AppointInt;
import com.bridgelabz.cliniquemanagement.service.AppointmentImp;
import com.bridgelabz.cliniquemanagement.service.DoctorImp;
import com.bridgelabz.cliniquemanagement.service.DoctorInt;
import com.bridgelabz.cliniquemanagement.service.PatientImp;
import com.bridgelabz.cliniquemanagement.service.PatientInt;
import com.bridgelabz.cliniquemanagement.util.Utility;

public class Appointment {

	public static void main(String[] args) throws Exception {
	
		
		AppointInt takeappoint=new AppointmentImp();
		DoctorInt doctor=new DoctorImp();
		PatientInt patient=new PatientImp();
		
		int choice=0;
		do {
			System.out.println("enter choice 1.add doctor\n2.add patient\n3.take appoinment");
			 choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:{
				doctor.addDoctor();
				break;
			}
			case 2:{
				patient.addPatients();
				break;
			}
			case 3:
			{
				System.out.println("enter doctor name");
				String doctorname=Utility.inputString();
				System.out.println("enter date");
				String date=Utility.inputString();
				takeappoint.canTakeAppointment(doctorname, date);
				break;
			}
			default :
				System.out.println("try again");
				break;
			}
		}while(choice<4);

	}

}
