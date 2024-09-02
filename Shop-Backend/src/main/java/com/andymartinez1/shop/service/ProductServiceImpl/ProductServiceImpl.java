package com.andymartinez1.shop.service.ProductServiceImpl;

import com.andymartinez1.shop.dto.ProductDTO;
import com.andymartinez1.shop.entity.Product;
import com.andymartinez1.shop.exception.ResourceNotFoundException;
import com.andymartinez1.shop.mapper.ProductMapper;
import com.andymartinez1.shop.repository.ProductRepository;
import com.andymartinez1.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> ProductMapper.mapToProductDTO(product))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO updateProduct(Long productId, ProductDTO updatedProduct) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with given id: " + productId));
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        product.setInventory(updatedProduct.getInventory());
        product.setDescription(updatedProduct.getDescription());
        Product updatedProductObj = productRepository.save(product);
        return ProductMapper.mapToProductDTO(updatedProductObj);
    }

    @Override
    public void deleteProduct(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with given id: " + productId));
        productRepository.delete(product);
    }
}
