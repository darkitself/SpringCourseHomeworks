package com.course.springhomeworks;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HeadersController {

    @GetMapping("/headers")
    public Map<String, String> getAllHeaders(HttpServletRequest request) {
        var headers = new HttpHeaders();

        for (var headerName : Collections.list(request.getHeaderNames())) {
            headers.add(headerName, request.getHeader(headerName));
        }
        return headers.toSingleValueMap();
    }
}