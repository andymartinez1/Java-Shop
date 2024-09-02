package com.andymartinez1.shop.mapper;

import com.andymartinez1.shop.dto.ProductDTO;
import com.andymartinez1.shop.entity.Product;

public class ProductMapper {

    public static ProductDTO mapToProductDTO(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getInventory(),
                product.getDescription(),
                product.getCategory()
        );
    }

    public static Product mapToProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getInventory(),
                productDTO.getDescription(),
                productDTO.getCategory()
        );
    }
}
