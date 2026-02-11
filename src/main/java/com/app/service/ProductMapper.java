package com.app.service;

import org.springframework.stereotype.Component;

import com.app.dto.ProductDTO;
import com.app.entity.Product;

@Component
public class ProductMapper {
	
	public Product producdtoToProduct(ProductDTO producdto) {
		Product product=new Product();
		product.setProductType(producdto.getProductType());
		product.setProductName(producdto.getProductName());
		product.setProductBrand(producdto.getProductBrand());
		product.setKilogram(producdto.getKilogram());
		product.setLitre(producdto.getLitre());
		product.setStock(producdto.getStock());
		product.setExpireDate(producdto.getExpireDate());
		return product;
	}
	
	
	public ProductDTO productToProductDTO(Product product) {
		ProductDTO productdto=new ProductDTO();
		productdto.setProductType(product.getProductType());
		productdto.setProductName(product.getProductName());
		productdto.setProductBrand(product.getProductBrand());
		productdto.setKilogram(product.getKilogram());
		productdto.setLitre(product.getLitre());
		productdto.setStock(product.getStock());
		productdto.setExpireDate(product.getExpireDate());
		return productdto;
	}

}
