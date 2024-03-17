package com.course.springhomeworks.config.conditional;


import com.course.springhomeworks.config.PropertyConfig;
import com.course.springhomeworks.config.property.Property;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EnvironmentConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Property property = context.getBeanFactory().getBean(Property.class);
        String environment = property.getEnvironmentVariable();
        return environment!=null && !property.getEnvironmentVariable().equals("default");
    }
}
