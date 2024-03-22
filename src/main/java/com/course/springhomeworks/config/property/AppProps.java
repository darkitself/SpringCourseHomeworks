package com.course.springhomeworks.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class AppProps {
    String appName;
    List<Integer> numList;
    String environmentVariable;
}
