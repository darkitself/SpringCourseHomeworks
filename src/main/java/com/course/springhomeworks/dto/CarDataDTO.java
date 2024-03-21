package com.course.springhomeworks.dto;

import com.course.springhomeworks.validators.ItIsLicencePlate;
import com.course.springhomeworks.validators.ItIsName;
import com.course.springhomeworks.validators.ItIsNumberOfVehiclePassport;

public record CarDataDTO
        (
                // Аннотация для валидации, объединяющая несколько других аннотаций
                @ItIsNumberOfVehiclePassport
                Integer numberOfVehiclePassport,
                // Кастомная Аннотация для кастомной валидации
                @ItIsLicencePlate
                String licencePlate,
                // Кастомная Аннотация для кастомной валидации
                @ItIsName
                String carOwnerName

        )
{}
