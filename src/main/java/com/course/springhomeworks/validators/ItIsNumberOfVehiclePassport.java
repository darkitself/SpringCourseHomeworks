package com.course.springhomeworks.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ItIsNumberOfVehiclePassportVal.class)

@Min(value = 100000, message = "В номере ПТС не менее 6 символов")
@Max(value = 999999, message = "В номере ПТС не более 6 символов")
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ItIsNumberOfVehiclePassport {
    // (Да, условие из воздуха)
    String message() default "Номер ПТС не может иметь средний из возможных номеров";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
