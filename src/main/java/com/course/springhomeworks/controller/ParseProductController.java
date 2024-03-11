package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.InvalidRequestException;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.model.dto.ProductDTO;
import com.course.springhomeworks.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParseProductController {
    private final ProductService productService;
    public ParseProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/product")
    public Product parseProductDTO(@RequestBody ProductDTO productDTO) throws InvalidRequestException {
        return productService.addProduct(productDTO);
    }
}
