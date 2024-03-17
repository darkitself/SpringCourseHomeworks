package com.course.springhomeworks.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("skblab.intern")
public class AppProps {
    String appName;
    List<Integer> numList;
    String environmentVariable;
}
