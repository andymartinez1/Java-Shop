package com.andymartinez1.shop.service.ProductServiceImpl;

import com.andymartinez1.shop.entity.Category;
import com.andymartinez1.shop.repository.CategoryRepository;
import com.andymartinez1.shop.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
