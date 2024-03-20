package com.course.springhomeworks.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.*;

import java.lang.annotation.*;

@Target({ ElementType.FIELD })
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@NotBlank
@Size(min = 10, max = 20)
@Email
public @interface EmailConstraint {

    String message() default "Неверная почта";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
