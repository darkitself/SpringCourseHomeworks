package com.course.springhomeworks.config.condition;

import com.course.springhomeworks.config.property.AppProps;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EnvironmentCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        AppProps appProps = context.getBeanFactory().getBean(AppProps.class);
        String env = appProps.getEnvironmentVariable();
        return env != null && !appProps.getEnvironmentVariable().equals("default");
    }
}
