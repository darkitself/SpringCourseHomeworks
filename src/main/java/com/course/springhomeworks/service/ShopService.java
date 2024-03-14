package com.course.springhomeworks.service;

import com.course.springhomeworks.service.model.ProductInfo;
import com.course.springhomeworks.web.dto.ProductInfoDTO;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ShopService {
    private static Map<Integer, ProductInfo> products = new ConcurrentHashMap<>();

    public static ProductInfo addDB(ProductInfoDTO productInfoDTO) {
        var info = new ProductInfo.Info();
        var index = products.size() + 1;
        info.setId(index);
        info.setDate(productInfoDTO.info().date());
        var productInfo = new ProductInfo();
        productInfo.setPrice(productInfoDTO.price());
        productInfo.setInfo(info);
        products.put(index, productInfo);
        return productInfo;
    }

}
