package com.course.springhomeworks.validator;

import com.course.springhomeworks.validator.validatorsClasses.PositiveAndEvenValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PositiveAndEvenValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PositiveAndEven {
    String message() default "Число x должно соответсвовать условию: x > 0 & x % 2 == 0";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
