package com.shraddha.HospitalRoom_Management.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.shraddha.HospitalRoom_Management.entity.HospitalRoom;

public class HospitalRoomDAO {
	public EntityManager getEM() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("room_pu");
    	EntityManager em = emf.createEntityManager();
    	return em;
	}
	

	public boolean addPatientRecord(HospitalRoom h)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		em.persist(h);
		em.getTransaction().commit();
		return true;
	}
	
	public HospitalRoom getPatientRecord(int regno)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		HospitalRoom h = em.find(HospitalRoom.class, regno);
		em.getTransaction().commit();
		return h;
	}
	
	public boolean updatePatientRecord(HospitalRoom h)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		HospitalRoom h1 = em.find(HospitalRoom.class,h.getRegno());
		h1.setName(h.getName());
		h1.setBedno(h.getBedno());
		h1.setMedicines(h.getMedicines());
		h1.setBill(h.getBill());
		em.getTransaction().commit();
		return true;
	}
	
	public boolean deletePatientRecord(int regno)
	{
		EntityManager em = getEM();
		em.getTransaction().begin();
		HospitalRoom h = em.find(HospitalRoom.class, regno);
		em.remove(h);
		em.getTransaction().commit();
		return true;
	}
	
}
