package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.entity.Product;
import com.app.service.ProductMapper;
import com.app.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductServiceImpl service;
	private final ProductMapper mapper;
	
	public ProductController(ProductServiceImpl service,ProductMapper mapper) {
		super();
		this.service = service;
		this.mapper = mapper;
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<ProductDTO>> getALLProduct(){
		 List<Product> products = service.getAllProducts();

		    List<ProductDTO> productDTOList = products.stream()
		            .map(mapper::productToProductDTO)
		            .toList();

		    return ResponseEntity.status(HttpStatus.OK).body(productDTOList);
	}
	@GetMapping("/{productid}")
	public ResponseEntity<ProductDTO> getProductById(@PathVariable int id){
		Product product=service.getProductById(id);
		return ResponseEntity.status(HttpStatus.OK).body(mapper.productToProductDTO(product));
	}

	@PostMapping("/create")
	public ResponseEntity<ProductDTO> addProduct(@RequestBody Product data){
		Product product=service.createProduct(data);
		return ResponseEntity.status(HttpStatus.CREATED).body(mapper.productToProductDTO(product));
	}
	
	@PostMapping("/update")
	public ResponseEntity<ProductDTO> updateProduct(@RequestBody Product data){
		Product product=service.updateProduct(data);
		return ResponseEntity.status(HttpStatus.OK).body(mapper.productToProductDTO(product));

	}
}
