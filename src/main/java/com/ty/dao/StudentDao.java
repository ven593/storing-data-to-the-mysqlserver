package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;

public class StudentDao {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = null;

	/*
	 * public Student validate(int id, String name) { Query query =
	 * em.createQuery("select s from Student s where id = ?1 and name = ?2");
	 * query.setParameter(1, id); query.setParameter(2, name);
	 * 
	 * Student student = (Student) query.getSingleResult(); if (student != null) {
	 * return student; } else return null;
	 * 
	 * }
	 */

	public void saveObject(Student student) {
	
		et = em.getTransaction();
		et.begin();
		em.persist(student);
 
		et.commit();
	}

 

}
