package com.course.springhomeworks.adapter.web.validation;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.NotNull;

public class IsJavaDevValidator implements ConstraintValidator<IsJavaDevConstraint, PersonDTO> {
    @Override
    public boolean isValid(@NotNull(message = "не может быть пустым") PersonDTO personDTO,
                           ConstraintValidatorContext constraintValidatorContext) {
        return personDTO.isJavaBackEndDev();
    }
}
