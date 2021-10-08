package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Product;
@Repository
public class ProductDao {
	@Autowired
	EntityManagerFactory emf;				// Datasource like Connection reference. 
		public int storeProductInfo(Product product) {
		try {
		EntityManager manager = emf.createEntityManager();			//like PreparedStatement or Statement 
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
				manager.persist(product);                                                      // save the record 
		tran.commit();
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		return 1;
	}
		
		
	public List<Product> getAllProducts() {
		EntityManager manager = emf.createEntityManager();
		Query qry	= manager.createQuery("select p from Product p");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	public boolean updateProduct(Product product) {
		EntityManager manager = emf.createEntityManager();
		// find method take 1st parameter entity class name and 2nd parameter column with pk 
		Product pp = manager.find(Product.class, product.getPid());
		if(pp==null) {
			return false;
		}else {
			EntityTransaction tran = manager.getTransaction();
					pp.setPrice(product.getPrice());
					tran.begin();
					manager.merge(pp);						// merge method to update the records.
					tran.commit();
			return true;
		}
	}
	
	
	public boolean deleteProduct(int pid) {
		EntityManager manager = emf.createEntityManager();
		// find method take 1st parameter entity class name and 2nd parameter column with pk 
		Product pp = manager.find(Product.class, pid);
		if(pp==null) {
			return false;
		}else {
			EntityTransaction tran = manager.getTransaction();
					tran.begin();
					manager.remove(pp);						// remove the records. 
					tran.commit();
			return true;
		}
	}
	
	public Product findProduct(int pid) {
		EntityManager manager = emf.createEntityManager();
		Product pp = manager.find(Product.class, pid);
		return pp;
	}
}
