package com.course.springhomeworks.adapter.web.validation;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IsJavaDevValidator implements ConstraintValidator<IsJavaDevConstraint, PersonDTO> {
    @Override
    public boolean isValid(PersonDTO personDTO,
                           ConstraintValidatorContext constraintValidatorContext) {
        return personDTO.isJavaBackEndDev();
    }
}
