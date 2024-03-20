package com.course.springhomeworks.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.lang.annotation.*;

@Documented
@NotNull // Не null (первая аннотация)
@Size(min = 4, max = 15) // Ограничение по длине (вторая аннотация)
@Constraint(validatedBy = {})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NameValidation { // Аннотация для валидации, объединяющая несколько других аннотаций

    String message() default "Invalid name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
