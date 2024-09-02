package com.andymartinez1.shop.service;

import com.andymartinez1.shop.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO getProductById(Long productId);

    List<ProductDTO> getAllProducts();

    ProductDTO updateProduct(Long productId, ProductDTO updatedProduct);

    void deleteProduct(Long productId);
}
