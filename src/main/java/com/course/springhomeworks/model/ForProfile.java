package com.course.springhomeworks.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class ForProfile extends Base{
}
