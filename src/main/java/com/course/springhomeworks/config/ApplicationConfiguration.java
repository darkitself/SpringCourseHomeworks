package com.course.springhomeworks.config;

import com.course.springhomeworks.config.condition.EnvironmentCondition;
import com.course.springhomeworks.config.condition.TestBeanExistCondition;
import com.course.springhomeworks.config.property.AppProps;
import com.course.springhomeworks.domain.DevEntity;
import com.course.springhomeworks.domain.ProdEntity;
import com.course.springhomeworks.domain.TestEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
@EnableConfigurationProperties(AppProps.class)
@RequiredArgsConstructor
public class ApplicationConfiguration {

    private final AppProps appProps;

    @ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "test")
    @Bean
    public TestEntity testBean(){
        log.info("init testBean");
        return new TestEntity(appProps.getNumList());
    }

    @Bean
    @Conditional(TestBeanExistCondition.class)
    public DevEntity devBean(){
        log.info("init devBean");
        return new DevEntity(appProps.getAppName());
    }

    @Bean
    @Conditional(EnvironmentCondition.class)
    public ProdEntity prodBean(){
        log.info("init prodBean");
        return new ProdEntity(appProps.getEnvironmentVariable());
    }
}
