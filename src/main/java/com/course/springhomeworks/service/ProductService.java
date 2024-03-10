package com.course.springhomeworks.service;

import com.course.springhomeworks.exception.InvalidRequestException;
import com.course.springhomeworks.model.Product;
import com.course.springhomeworks.model.ProductInfo;
import com.course.springhomeworks.model.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ProductService {
    private static CopyOnWriteArrayList<Product> products = new CopyOnWriteArrayList<>();
    public static Product addProduct(ProductDTO productDTO) throws InvalidRequestException {
        try {
            ProductInfo info = new ProductInfo();
            Product product = new Product();
            info.setDate(productDTO.getInfo().getDate());
            info.setId(products.size());
            product.setPrice(productDTO.getPrice());
            product.setInfo(info);
            products.add(product);
            return product;
        }catch (NullPointerException e){
            throw new InvalidRequestException();
        }
    }
}
