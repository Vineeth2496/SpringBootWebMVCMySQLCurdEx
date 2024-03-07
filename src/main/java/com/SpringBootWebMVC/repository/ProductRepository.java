package com.SpringBootWebMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootWebMVC.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
