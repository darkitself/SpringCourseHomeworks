package com.course.springhomeworks.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Value(staticConstructor = "of")
public class Person {
    Long id;
    String firstName;
    String lastName;
    String email;
    LocalDate endOfInternship;
}
