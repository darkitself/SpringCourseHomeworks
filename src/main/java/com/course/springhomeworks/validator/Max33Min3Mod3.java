package com.course.springhomeworks.validator;

import com.course.springhomeworks.validator.validatorsClasses.Mod3Validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = Mod3Validator.class)
@Max(value = 33, message = "Число y должно соответсвовать условию: y <= 33")
@Min(value = 3, message = "Число y должно соответсвовать условию: y >= 3")
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Max33Min3Mod3 {
    String message() default "Число y должно соответсвовать условию: y % 3 == 0";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
