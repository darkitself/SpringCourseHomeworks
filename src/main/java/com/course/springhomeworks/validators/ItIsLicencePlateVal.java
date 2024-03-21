package com.course.springhomeworks.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ItIsLicencePlateVal implements ConstraintValidator<ItIsLicencePlate, String> {
    @Override
    public boolean isValid(String licencePlateData, ConstraintValidatorContext constraintValidatorContext) {
        return licencePlateData.matches("^[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}$");
    }
}

