package com.course.springhomeworks.config;

import com.course.springhomeworks.config.property.AppProps;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppProps.class)
public class AppPropsConfiguration {

}
