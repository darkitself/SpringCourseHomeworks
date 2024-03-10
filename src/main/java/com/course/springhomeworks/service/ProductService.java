package com.course.springhomeworks.service;

import com.course.springhomeworks.model.DTO.InfoDTO;
import com.course.springhomeworks.model.DTO.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public Product addToDataBase(ProductDTO productDTO, List<Product> database){
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
}
