package com.course.springhomeworks.config.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "myapp")
public class AppProperties {
    String appName;
    int[] list;
    String envVar;
}
