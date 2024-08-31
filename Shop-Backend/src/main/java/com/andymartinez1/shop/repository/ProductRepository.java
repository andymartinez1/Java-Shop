package com.andymartinez1.shop.repository;

import com.andymartinez1.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
