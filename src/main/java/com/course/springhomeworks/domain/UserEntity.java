package com.course.springhomeworks.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class UserEntity implements UserDetails {
    String username;
    String password;
    @Type(JsonType.class)
    List<UserRole> authorities;
    boolean accountNonExpired;
    boolean accountNonLocked;
    boolean credentialsNonExpired;
    boolean enabled;
}
