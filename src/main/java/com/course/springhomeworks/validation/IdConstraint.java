package com.course.springhomeworks.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdValidator.class)
@Documented
public @interface IdConstraint {

    String message() default "Неверный id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
