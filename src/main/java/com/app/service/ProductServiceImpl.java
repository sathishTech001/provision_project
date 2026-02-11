package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Product;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements productService{
	
	private final ProductRepository repo ;
	
	public ProductServiceImpl(ProductRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product createProduct(Product data) {
		return repo.save(data);
	}

	@Override
	public Product updateProduct(Product data) {
		return repo.save(data);
	}
}
