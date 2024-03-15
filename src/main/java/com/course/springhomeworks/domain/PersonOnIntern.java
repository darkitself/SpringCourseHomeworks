package com.course.springhomeworks.domain;

import lombok.Value;

import java.time.LocalDate;


@Value(staticConstructor = "of")
public class PersonOnIntern {
    Long id;
    String firstName;
    String lastName;
    String email;
    LocalDate endOfInternship;
}
