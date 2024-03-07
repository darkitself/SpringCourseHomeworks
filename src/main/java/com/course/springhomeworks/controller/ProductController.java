package com.course.springhomeworks.controller;

import com.course.springhomeworks.exception.ProductNotFoundException;
import com.course.springhomeworks.model.DTO.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.InfoDTO;
import com.course.springhomeworks.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private static final List<Product> database = new ArrayList<>();
    static {
        database.add(new Product(20.0, new Info(1, "2022-01-01")));
        database.add(new Product(12.0, new Info(2, "2022-01-02")));
        database.add(new Product(1.0, new Info(3, "2022-01-03")));
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody ProductDTO productDTO){
        Product product = new Product();
        product.setPrice(productDTO.getPrice());
        Info info = new Info();
        InfoDTO infoDTO = productDTO.getInfoDTO();
        info.setDate(infoDTO.getDate());
        info.setId(database.get(database.size() - 1).getInfo().getId() + 1); // берем последнюю запись смотрим на её id и прибавляем 1
        product.setInfo(info);
        database.add(product);
        return product;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable double id){
        return database.stream().
                filter(product -> product.getInfo().getId() == id).
                findFirst().orElseThrow(() -> new ProductNotFoundException(id));
    }
}
