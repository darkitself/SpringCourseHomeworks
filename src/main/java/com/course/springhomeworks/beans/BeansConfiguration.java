package com.course.springhomeworks.beans;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;

@Configuration
@Log4j2
public class BeansConfiguration {

    @Profile("test")
    @Bean
    public BeanOne beanOne() {
        log.info("beanOne");
        return new BeanOne();
    }

    @Bean
    @ConditionalOnBean(name = "beanOne") // Указываем, что BeanTwo зависит от BeanOne
    public BeanTwo beanTwo() {
        log.info("beanTwo");
        return new BeanTwo();
    }

    @Bean
    @ConditionalOnExpression("#{ '${EXAMPLE_TEST}' != 'default' }")
    public BeanThree beanThree() {
        log.info("beanThree");
        return new BeanThree();
    }
}
