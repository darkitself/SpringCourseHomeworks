package com.course.springhomeworks.web;

import com.course.springhomeworks.service.common.ProductInfo;
import com.course.springhomeworks.web.dto.ProductInfoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/shop/", produces = APPLICATION_JSON_VALUE)
public class ProductController {
    private static HashMap<Integer, ProductInfo> products = new HashMap<Integer, ProductInfo>();
    @GetMapping("/header")
    public ResponseEntity<Map<String, String>> getHeader (@RequestHeader Map<String, String> header){
        return ResponseEntity.ok(header);
    }

    @PostMapping("/addProduct")
    public static ProductInfo postProduct (@RequestBody ProductInfoDTO productInfoDTO) {
        var info = new ProductInfo.Info();
        info.setId(products.size() + 1);
        info.setDate(productInfoDTO.info().date());
        var productInfo = new ProductInfo();
        productInfo.setPrice(productInfoDTO.price());
        productInfo.setInfo(info);
        products.put(products.size() + 1, productInfo);
        return productInfo;
    }
}
