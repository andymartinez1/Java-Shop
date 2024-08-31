package com.andymartinez1.shop.service.ProductServiceImpl;

import com.andymartinez1.shop.dto.ProductDTO;
import com.andymartinez1.shop.entity.Product;
import com.andymartinez1.shop.exception.ResourceNotFoundException;
import com.andymartinez1.shop.mapper.ProductMapper;
import com.andymartinez1.shop.repository.ProductRepository;
import com.andymartinez1.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = ProductMapper.mapToProduct(productDTO);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDTO(savedProduct);
    }

    @Override
    public ProductDTO getProductById(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with given id: " + productId));
        return ProductMapper.mapToProductDTO(product);
    }
}
