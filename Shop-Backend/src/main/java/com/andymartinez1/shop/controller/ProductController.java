package com.andymartinez1.shop.controller;

import com.andymartinez1.shop.dto.ProductDTO;
import com.andymartinez1.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO savedProduct = productService.createProduct(productDTO);
        return new ResponseEntity<>(savedProduct, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long productId) {
        ProductDTO productDTO = productService.getProductById(productId);
        return ResponseEntity.ok(productDTO);
    }
}
