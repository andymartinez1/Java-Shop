package com.andymartinez1.shop.repository;

import com.andymartinez1.shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
