package com.course.springhomeworks.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<PasswordValidation, String> {

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        var message = "";
        if (password.isEmpty()) {
            message = "Это обязательное поле";
        } else if (password.length() < 8) {
            message = "Длина пароля должна быть минимум 8 символов";
        } else if (password.length() > 20) {
            message = "Длина пароля не должна превышать 20-ти символов";
        }else if (!isStringContainNumber(password)) {
            message = "Пароль должен содержать хотя бы одну цифру";
        } else if (!isStringContainUpperCase(password)) {
            message = "Пароль должен содержать хотя бы одну заглавную букву";
        }

        if (message.equals("")) {
            return true;
        } else {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
            return false;
        }
    }

    private boolean isStringContainNumber(String text) {
        var pattern = Pattern.compile(".*\\d.*");
        var matcher = pattern.matcher(text);
        return matcher.matches();
    }

    private boolean isStringContainUpperCase(String text) {
        var upperCasePattern = Pattern.compile(".*[A-ZА-Я].*");
        var upperCasePatterMatcher = upperCasePattern.matcher(text);
        return upperCasePatterMatcher.matches();
    }
}

