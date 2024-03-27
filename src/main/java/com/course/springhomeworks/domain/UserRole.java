package com.course.springhomeworks.domain;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ADMIN,
    SUPPORT,
    DEFAULT;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
