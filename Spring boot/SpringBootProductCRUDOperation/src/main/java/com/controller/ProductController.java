package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	 // http://localhost:9090/storeProductInfo
	@RequestMapping(value = "storeProductInfo",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeProductDetails(@RequestBody Product product) {
		return productService.storeProductRecord(product);
	}
	
	// http://localhost:9090/allProducts 
	
	@RequestMapping(value = "allProducts",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProductsInfo();
	}
	
	// http://localhost:9090/updateProduct 
	@RequestMapping(value = "updateProduct",
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProdut(product);
	}

	// http://localhost:9090/deleteProductById/1
		@RequestMapping(value = "deleteProductById/{pid}",method = RequestMethod.DELETE)
	public String deleteProductInfo(@PathVariable("pid") int pid) {
		return productService.deleteProductInfo(pid);
	}
		// http://localhost:9090/findProductById/2
		@RequestMapping(value = "findProductById/{pid}",method = RequestMethod.GET)
		public Product findProductInfo(@PathVariable("pid") int pid) {
			return productService.findProdutInfo(pid);
		}
}

