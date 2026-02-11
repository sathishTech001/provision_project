package com.app.service;

import java.util.List;
import com.app.entity.Product;

public interface productService {
	
	List<Product> getAllProducts();
	Product createProduct(Product data);
	Product updateProduct(Product data);
	
}
