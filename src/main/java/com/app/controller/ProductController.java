package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Product;
import com.app.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductServiceImpl service;
	
	public ProductController(ProductServiceImpl service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAll")
	public List<Product> getALLProduct(){
		return service.getAllProducts();
	}

	@PostMapping("/create")
	public Product addProduct(@RequestBody Product data){
		return service.createProduct(data);
	}
	
	@PostMapping("/update")
	public Product updateProduct(@RequestBody Product data){
		return service.updateProduct(data);
	}
}
