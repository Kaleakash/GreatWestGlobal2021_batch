package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Trainer;

@Repository
public class TrainerDao {

	@Autowired
	EntityManagerFactory emf;
	
	public boolean storeTrainer(Trainer trainer) {
		try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(trainer);
		tran.commit();
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public 	List<Object[]>	retrieveJoin() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createNativeQuery("select t.tid,t.tname,t.tech,s.sid,sname from trainer t, student s where t.tid=s.tsid");
		List<Object[]>	listOfRec = qry.getResultList();
		return listOfRec;
	}
}
