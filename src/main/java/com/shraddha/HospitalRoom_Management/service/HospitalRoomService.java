package com.shraddha.HospitalRoom_Management.service;

import java.util.Scanner;

import com.shraddha.HospitalRoom_Management.dao.HospitalRoomDAO;
import com.shraddha.HospitalRoom_Management.entity.HospitalRoom;

public class HospitalRoomService {
	HospitalRoomDAO hdao = new HospitalRoomDAO();
	Scanner ip = new Scanner(System.in);

	public boolean addPatient(int count)
	{
		while(count>0)
		{
			System.out.println("Enter the Patient Details:");
			System.out.println("EnterPatient REGNO: ");
			int regno = ip.nextInt();
			ip.nextLine();
			System.out.println("Enter Patient Name: ");
			String name = ip.nextLine();
			System.out.println("Enter the Patient BEDNO: ");
			int bedno = ip.nextInt();
			ip.nextLine();
			System.out.println("Enter the Patient MEDICINE: ");
			String medicines = ip.nextLine();
			ip.nextLine();
			System.out.println("Enter the Patient BILL: ");
			double bill = ip.nextDouble();
			HospitalRoom h = new HospitalRoom(regno,name,bedno,medicines,bill);
			hdao.addPatientRecord(h);
			count--;
		}
		return true;	
	}
	
	public HospitalRoom viewPatient(int regno)
	{
		return hdao.getPatientRecord(regno);
	}
	
	public boolean updatePatient(int bid)
	{
		System.out.println("Enter the Patient Details:");
		
		System.out.println("EnterPatient REGNO: ");
		int regno = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Patient Name: ");
		String name = ip.nextLine();
		System.out.println("Enter the Patient BEDNO: ");
		int bedno = ip.nextInt();
		System.out.println("Enter the Patient MEDICINE: ");
		String medicines = ip.nextLine();
		ip.nextLine();
		System.out.println("Enter the Patient BILL: ");
		double bill = ip.nextDouble();
		HospitalRoom h = new HospitalRoom(regno,name,bedno,medicines,bill);
		hdao.updatePatientRecord(h);
		return true;
	}
	
	public boolean deletePatient(int regno)
	{
		return hdao.deletePatientRecord(regno);
	}
}
