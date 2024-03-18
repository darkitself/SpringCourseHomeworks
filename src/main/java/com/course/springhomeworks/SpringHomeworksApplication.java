package com.course.springhomeworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.course.springhomeworks.config"})
public class SpringHomeworksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHomeworksApplication.class, args);
    }

}
