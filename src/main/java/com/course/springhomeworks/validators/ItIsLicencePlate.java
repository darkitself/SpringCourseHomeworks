package com.course.springhomeworks.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ItIsLicencePlateVal.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItIsLicencePlate {
    String message() default "Формат записи госномера должен соответствовать дорожному кодексу РФ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
