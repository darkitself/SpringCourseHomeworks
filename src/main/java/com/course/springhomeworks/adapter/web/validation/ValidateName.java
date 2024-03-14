package com.course.springhomeworks.adapter.web.validation;

import jakarta.validation.Constraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
//todo @Constraint
public @interface ValidateName {
    NotBlank notBlank() default @NotBlank(message = "Имя или Фамилия не могут быть пустыми");

    Size size() default @Size(max = 20, message = "Имя или Фамилия должны быть короче 20 символов");
}
