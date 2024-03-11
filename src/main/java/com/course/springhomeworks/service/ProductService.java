package com.course.springhomeworks.service;

import com.course.springhomeworks.exception.ProductNotFoundException;
import com.course.springhomeworks.model.dto.InfoDTO;
import com.course.springhomeworks.model.dto.ProductDTO;
import com.course.springhomeworks.model.Info;
import com.course.springhomeworks.model.Product;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ProductService {
    private static final Map<Integer, Product> database = new ConcurrentHashMap<>();

    static {
        Product product1 = new Product(20.0, new Info(1, LocalDate.parse("2022-01-01")));
        database.put(database.size() + 1, product1);
        Product product2 = new Product(12.0, new Info(2, LocalDate.parse("2022-01-02")));
        database.put(database.size() + 1, product2);
        Product product3 = new Product(1.0, new Info(3, LocalDate.parse("2022-01-03")));
        database.put(database.size() + 1, product3);
    }
    public Product addToDataBase(ProductDTO productDTO){
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

    public Product getProductById(int id){
        if (id > 0 && id <= database.size()){
            if (database.get(id) != null ){
                return database.get(id);
            }
        }

        throw new ProductNotFoundException(id);
    }
}
