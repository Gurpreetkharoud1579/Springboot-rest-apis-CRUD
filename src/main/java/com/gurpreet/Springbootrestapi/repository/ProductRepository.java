package com.gurpreet.Springbootrestapi.repository;

import com.gurpreet.Springbootrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
