package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.InvalidRequestException;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.model.ProductInfo;
import com.course.springhomeworks.model.dto.ProductDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParseProductController {
    private static List<Product> products = new ArrayList<>();
    @PostMapping("/product")
    public static Product parseProductDTO(@RequestBody ProductDTO productDTO) throws InvalidRequestException {
        try {
            ProductInfo info = new ProductInfo();
            Product product = new Product();
            info.setDate(productDTO.getInfo().getDate());
            info.setId(products.size());
            product.setPrice(productDTO.getPrice());
            product.setInfo(info);
            products.add(product);
            return product;
        }catch (Exception e){
            throw new InvalidRequestException();
        }
    }
}
