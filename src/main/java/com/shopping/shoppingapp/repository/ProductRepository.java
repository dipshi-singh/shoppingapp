package com.shopping.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.shoppingapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
