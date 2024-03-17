package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@NotBlank(message = "имя не должно быть пустым")
@Size(max = 50, message = "Имя/Фамилия не должны превышать 50 символов")
@Constraint(validatedBy = NameValidator.class)
public @interface NameConstraint {
    String message() default "Имя/Фамилия не должны превышать 50 символов, не должны содержать цифр";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
