package com.shraddha.HospitalRoom_Management;

import java.util.Scanner;

import com.shraddha.HospitalRoom_Management.service.HospitalRoomService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HospitalRoomService hs = new HospitalRoomService();
		int regno;
		char ch = 'Y';
		while(ch == 'Y')
		{
		System.out.println("*********HospitalRoomManagement***********");
		System.out.println("1)Add Patient\n2)View Patient\n3)Update Patient\n4)DeletePatient");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int option = ip.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("Enter the number of Patients:");
				int count = ip.nextInt();
				hs.addPatient(count);
				break;
			case 2:
				System.out.println("Enter the patient regno :");
				regno = ip.nextInt();
				System.out.println(hs.viewPatient(regno));
				break;
			
			case 3:
				System.out.println("Enter the patient regno :");
				regno = ip.nextInt();
				hs.updatePatient(regno);
				break;
			case 4:
				System.out.println("Enter the patient regno :");
				regno = ip.nextInt();
				hs.deletePatient(regno);
				break;
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		System.out.println("Enter Y to continue...");
		ch = ip.next().charAt(0);
		}
		System.out.println("Thank you for using...");
    }
    
}
