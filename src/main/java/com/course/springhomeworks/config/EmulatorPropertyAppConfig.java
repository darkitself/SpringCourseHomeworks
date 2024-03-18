package com.course.springhomeworks.config;

import com.course.springhomeworks.common.SecondValue;
import com.course.springhomeworks.common.ThirdValue;
import com.course.springhomeworks.common.TestValue;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class EmulatorPropertyAppConfig {

    @Bean
    @Profile("test")
    public TestValue testValue() {
        return new TestValue();
    }
    @Bean
    @ConditionalOnBean(name = "testValue")
    public SecondValue secondValue(){
        return new SecondValue();
    }

    @Bean
    @ConditionalOnExpression(value = "#{ '${app.EXAMPLE_TEST}' != 'default' }")
    public ThirdValue thirdValue(){
        return new ThirdValue();
    }
}
