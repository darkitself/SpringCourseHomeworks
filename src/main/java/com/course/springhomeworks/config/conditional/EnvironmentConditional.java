package com.course.springhomeworks.config.conditional;

import com.course.springhomeworks.config.PropertyConfig;
import com.course.springhomeworks.config.property.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
@RequiredArgsConstructor
public class EnvironmentConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("EXAMPLE_TEST");
        return !property.equals("default");
    }
}
