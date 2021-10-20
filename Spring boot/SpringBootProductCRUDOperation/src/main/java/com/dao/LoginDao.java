package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Login;

public class LoginDao {
	@Autowired
	EntityManagerFactory emf;				// Datasource like Connection reference. 

	
	public int checkLogin(Login login) {
		EntityManager manager = emf.createEntityManager();
		Query qry	= manager.createQuery("select l from Login l where l.email=:user and l.pass=:pass");
		qry.setParameter("email", login.getEmail());
		qry.setParameter("pass", login.getPass());
		List<Login> ll = qry.getResultList();
		return ll.size();
	}
}
