package com.andymartinez1.shop.dto;

import com.andymartinez1.shop.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private int inventory;
    private String description;
    private Category category;
}
