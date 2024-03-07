package com.SpringBootWebMVC.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootWebMVC.model.Product;
import com.SpringBootWebMVC.repository.ProductRepository;
import com.SpringBootWebMVC.service.IProductService;
@Service	//calc + opr/Tr Management
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	@Override
	public Integer saveProduct(Product p) {
		p=repo.save(p);
		return p.getProdId();
	}

	@Override
	public void updateProduct(Product p) {
		//is exist then update
		repo.save(p);
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Product> getOneProduct(Integer id) {
		Optional<Product> opt= repo.findById(id);
		
		return opt;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list=repo.findAll();
		
		return list;
	}

}
