package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { })
@NotNull
@Size(min = 3, max = 20)
public @interface CorrectName {

    String message() default "The name must be between 3 and 20 characters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}