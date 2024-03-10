package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.ProductNotFoundException;
import com.course.springhomeworks.model.DTO.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ProductController {
    private static final Map<Integer, Product> database = new ConcurrentHashMap<>();

    static {
        Product product1 = new Product(20.0, new Info(1, LocalDate.parse("2022-01-01")));
        database.put(database.size() + 1, product1);
        Product product2 = new Product(12.0, new Info(2, LocalDate.parse("2022-01-02")));
        database.put(database.size() + 1, product2);
        Product product3 = new Product(1.0, new Info(3, LocalDate.parse("2022-01-03")));
        database.put(database.size() + 1, product3);
    }

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDTO productDTO) {
        return productService.addToDataBase(productDTO, database);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) throws ProductNotFoundException {
        if (id < 0 || id > database.size()) {
            throw new ProductNotFoundException(id);
        } else {
            return database.get(id);
        }
    }
}
