package com.course.springhomeworks.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ItIsNameVal implements ConstraintValidator<ItIsName, String> {
        @Override
        public boolean isValid(String licencePlateData, ConstraintValidatorContext constraintValidatorContext) {
            return licencePlateData.matches("[а-яА-Я]+");
    }
}
