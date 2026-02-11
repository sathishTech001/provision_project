package com.app.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;


@Component
public class ProductDTO {
	    private Long productId;
	    private String productType;
	    private String productName;
	    private String productBrand;
	    private Integer kilogram;
	    private Integer litre;
	    private Integer stock;
		private LocalDateTime expireDate;
	    public Long getProductId() {
			return productId;
		}
		public void setProductId(Long productId) {
			this.productId = productId;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductBrand() {
			return productBrand;
		}
		public void setProductBrand(String productBrand) {
			this.productBrand = productBrand;
		}
		public Integer getKilogram() {
			return kilogram;
		}
		public void setKilogram(Integer kilogram) {
			this.kilogram = kilogram;
		}
		public Integer getLitre() {
			return litre;
		}
		public void setLitre(Integer litre) {
			this.litre = litre;
		}
		public Integer getStock() {
			return stock;
		}
		public void setStock(Integer stock) {
			this.stock = stock;
		}
		public LocalDateTime getExpireDate() {
			return expireDate;
		}
		public void setExpireDate(LocalDateTime expireDate) {
			this.expireDate = expireDate;
		}


}
