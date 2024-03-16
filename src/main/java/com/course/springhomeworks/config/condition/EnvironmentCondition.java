package com.course.springhomeworks.config.condition;
import com.course.springhomeworks.config.property.AppProps;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

public class EnvironmentCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        AppProps appProps = Objects.requireNonNull(context.getBeanFactory()).getBean(AppProps.class);
        return !appProps.getEnvironmentVariable().equals("default");
    }
}
