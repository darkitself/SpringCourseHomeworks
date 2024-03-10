package com.course.springhomeworks.service;

import com.course.springhomeworks.model.dto.InfoDTO;
import com.course.springhomeworks.model.dto.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductService {
    public Product addToDataBase(ProductDTO productDTO, Map<Integer,Product> database){
        Product product = new Product();
        product.setPrice(productDTO.getPrice());
        Info info = new Info();
        InfoDTO infoDTO = productDTO.getInfoDTO();
        info.setDate(infoDTO.getDate());
        info.setId(database.get(database.size()).getInfo().getId() + 1); // берем последнюю запись смотрим на её id и прибавляем 1
        product.setInfo(info);
        database.put(database.size() + 1, product);
        return product;
    }
}
