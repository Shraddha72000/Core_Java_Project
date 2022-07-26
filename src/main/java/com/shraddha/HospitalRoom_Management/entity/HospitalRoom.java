package com.shraddha.HospitalRoom_Management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class HospitalRoom {
	@Id
	
	private int regno;
	private String name;
	private int bedno;
	private String medicines;
	private double bill;
	public HospitalRoom() {
		super();
	}
	public HospitalRoom(int regno, String name, int bedno, String medicines, double bill) {
		super();
		this.regno = regno;
		this.name = name;
		this.bedno = bedno;
		this.medicines = medicines;
		this.bill = bill;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBedno() {
		return bedno;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "HospitalRoom [regno=" + regno + ", name=" + name + ", bedno=" + bedno + ", medicines=" + medicines
				+ ", bill=" + bill + "]";
	}
	

}
