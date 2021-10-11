package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public class StudentDao {

	@Autowired
	EntityManagerFactory emf;
	public boolean storeStudentRecord(Student student) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(student);
		tran.commit();
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
