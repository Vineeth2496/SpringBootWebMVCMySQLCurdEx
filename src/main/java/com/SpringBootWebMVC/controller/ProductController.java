package com.SpringBootWebMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootWebMVC.model.Product;
import com.SpringBootWebMVC.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService service;	//HAS-A
	
	//1. show Register Page
	@GetMapping("/register")
	public String showReg() {
		return "ProductRegister";
	}
	//2. save on click submit
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product product, Model model) {
		Integer id=service.saveProduct(product);
		String msg="Product Created with id: "+id;
		model.addAttribute("message", msg);
		return "ProductRegister";
	}
	
	//3. display all products
	
	//4. delete product by id
	
	//5. show Edit Page with data
	
	//6. on click update modify in db
}
