package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Product;
import com.app.exception.ProductNotFoundException;
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
	public Product getProductById(long id) {
		 return repo.findById(id)
		            .orElseThrow(() -> 
		                new ProductNotFoundException("Product not found with id " + id));
		
	}

	@Override
	public Product createProduct(Product data) {
		return repo.save(data);
	}

	@Override
	public Product updateProduct(Product data) {
		Product product=repo.findById(data.getProductId())
        .orElseThrow(() -> 
            new ProductNotFoundException("Product not found with id " + data.getProductId()));
		Product updatedproduct=null;
        if(product!=null) {
        	updatedproduct=	 repo.save(data);
        }
        return updatedproduct;
	}
}
