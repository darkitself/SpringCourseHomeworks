package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.ProductNotFoundException;
import com.course.springhomeworks.model.dto.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addToDataBase(productDTO);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) throws ProductNotFoundException {
        return productService.getProductById(id);
    }
}
