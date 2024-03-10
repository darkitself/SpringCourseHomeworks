package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.ProductNotFoundException;
import com.course.springhomeworks.model.DTO.InfoDTO;
import com.course.springhomeworks.model.DTO.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {
    private static final List<Product> database = Collections.synchronizedList(new ArrayList<>());
    static {
        database.add(new Product(20.0, new Info(1, LocalDate.parse("2022-01-01"))));
        database.add(new Product(12.0, new Info(2,  LocalDate.parse("2022-01-02"))));
        database.add(new Product(1.0, new Info(3,  LocalDate.parse("2022-01-03"))));
    }
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDTO productDTO){
        return productService.addToDataBase(productDTO, database);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable double id){
        return database.stream().
                filter(product -> product.getInfo().getId() == id).
                findFirst().orElseThrow(() -> new ProductNotFoundException(id));
    }
}
