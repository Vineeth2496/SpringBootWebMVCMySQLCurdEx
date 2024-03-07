package com.SpringBootWebMVC.service;

import java.util.List;
import java.util.Optional;

import com.SpringBootWebMVC.model.Product;

public interface IProductService {
	Integer saveProduct(Product p);
	
	void updateProduct(Product p);
	void deleteProduct(Integer id);
	
	Optional<Product> getOneProduct(Integer id);
	
	List<Product> getAllProduct();
		
}
