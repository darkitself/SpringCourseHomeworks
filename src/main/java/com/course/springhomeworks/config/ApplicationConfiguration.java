package com.course.springhomeworks.config;

import com.course.springhomeworks.config.property.AppProps;
import com.course.springhomeworks.domain.DevEntity;
import com.course.springhomeworks.domain.ProdEntity;
import com.course.springhomeworks.domain.TestEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Configuration
@RequiredArgsConstructor
public class ApplicationConfiguration {

    private final AppProps appProps;

    @Bean
    @ConditionalOnProperty(prefix = "spring.profile", name = "active", havingValue = "test")
    public TestEntity testBean(){
        log.info("init testBean");
        return new TestEntity(appProps.getNumList());
    }

    @Bean
    @ConditionalOnBean(TestEntity.class)
    public DevEntity devBean(){
        log.info("init devBean");
        return new DevEntity(appProps.getAppName());
    }

    @Bean
    @ConditionalOnExpression(value = "#{ '${skblab.intern.environmentVariable}' != 'default' }")
    public ProdEntity prodBean(){
        log.info("init prodBean");
        return new ProdEntity(appProps.getEnvironmentVariable());
    }
}
