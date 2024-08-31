package com.andymartinez1.shop.service;

import com.andymartinez1.shop.dto.ProductDTO;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO getProductById(Long productId);
}
