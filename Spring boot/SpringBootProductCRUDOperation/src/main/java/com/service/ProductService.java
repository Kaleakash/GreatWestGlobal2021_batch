package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProductRecord(Product product) {
		if(productDao.storeProductInfo(product)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store ";
		}
	}
	
	public List<Product> getAllProductsInfo() {
		return productDao.getAllProducts();
	}
	
	public String updateProdut(Product product) {
		if(productDao.updateProduct(product)) {
			return "Product updated successfully";
		}else {
			return "Produt not present";
		}
	}
	
	public String deleteProductInfo(int pid) {
		if(productDao.deleteProduct(pid)) {
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public Product findProdutInfo(int pid) {
		return productDao.findProduct(pid);
	}
	
}
