package com.course.springhomeworks.config;

import com.course.springhomeworks.config.conditional.EnvironmentConditional;
import com.course.springhomeworks.config.property.Property;
import com.course.springhomeworks.service.ReceivingService;
import com.course.springhomeworks.service.SendingService;
import com.course.springhomeworks.service.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Configuration
@RequiredArgsConstructor
public class EmulationConfig {
    private final Property property;
    @ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "test")
    @Bean
    public TransferService testBean() {
        log.info("created test bean");
        return new TransferService();
    }

    @Bean
    @ConditionalOnBean(TransferService.class)
    public ReceivingService secondBean() {
        log.info("created second bean");
        return new ReceivingService();
    }

    @Bean
    @Conditional(EnvironmentConditional.class)
    public SendingService thirdBean() {
        log.info("crated third bean");
        return new SendingService();
    }
}
