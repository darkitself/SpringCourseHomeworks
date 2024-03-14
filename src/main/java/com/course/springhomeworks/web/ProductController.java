package com.course.springhomeworks.web;

import com.course.springhomeworks.service.ShopService;
import com.course.springhomeworks.service.model.ProductInfo;
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
        return ShopService.addDB(productInfoDTO);
    }
}
