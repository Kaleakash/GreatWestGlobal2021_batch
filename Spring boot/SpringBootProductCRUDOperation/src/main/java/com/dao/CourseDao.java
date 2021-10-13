package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Course;

@Repository
public class CourseDao {

	@Autowired
	EntityManagerFactory emf;
	
	public boolean storeCourseInfo(Course cc) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(cc);
		tran.commit();
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
