package com.app.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_details", schema = "master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_type", nullable = false, length = 100)
    private String productType;

    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "product_brand", length = 100)
    private String productBrand;

    @Column(name = "kilogram")
    private Integer kilogram;

    @Column(name = "litre")
    private Integer litre;

    @Column(name = "stock")
    private Integer stock;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "expire_date")
    private LocalDateTime expireDate;

    // DB handles DEFAULT CURRENT_TIMESTAMP
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    // DB handles ON UPDATE CURRENT_TIMESTAMP
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;
}
