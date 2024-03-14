package com.course.springhomeworks.adapter.web.validation;

import com.course.springhomeworks.adapter.web.dto.PersonDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SkillsValidator implements ConstraintValidator<SkillsAndJavaDevConstraint, PersonDTO> {
    @Override
    public boolean isValid(PersonDTO personDTO, ConstraintValidatorContext constraintValidatorContext) {
        if (personDTO.isJavaBackEndDev() && personDTO.skills().contains("validation")) {
            return true;
        }
        return false;
    }
}
