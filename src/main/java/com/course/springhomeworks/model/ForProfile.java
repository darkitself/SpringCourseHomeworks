package com.course.springhomeworks.model;

import lombok.Getter;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@Getter
public class ForProfile extends Base{
}
