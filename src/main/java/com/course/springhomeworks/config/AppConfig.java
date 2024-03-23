package com.course.springhomeworks.config;

import com.course.springhomeworks.config.props.AppProperties;
import com.course.springhomeworks.model.ModelWithAnother;
import com.course.springhomeworks.model.ModelWithParam;
import com.course.springhomeworks.model.ProfileModel;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(AppProperties.class)
@AllArgsConstructor
public class AppConfig {
    private AppProperties properties;

    @Bean(name = "ProfileBean")
    @Profile("test")
    public ProfileModel forProfile() {
        return new ProfileModel(properties.getAppName(), properties.getList(), properties.getEnvVar());
    }

    @Bean(name = "BeanWithAnother")
    @ConditionalOnBean(ProfileModel.class)
    public ModelWithAnother afterFirst() {
        return new ModelWithAnother(properties.getAppName(), properties.getList(), properties.getEnvVar());
    }

    @Bean(name = "BeanWithParam")
    @ConditionalOnExpression(value = "!'${envVar}'.equals('default')")
    public ModelWithParam withParam() {
        return new ModelWithParam(properties.getAppName(), properties.getList(), properties.getEnvVar());
    }
}
