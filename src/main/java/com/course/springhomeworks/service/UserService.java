package com.course.springhomeworks.service;

import com.course.springhomeworks.adapter.web.dto.UserDTO;
import com.course.springhomeworks.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final static ConcurrentHashMap<Integer,User> users = new ConcurrentHashMap<>();
    public User addUser(UserDTO userDTO){
        User user = new User();
        user.setId(users.size());
        user.setFirstName(userDTO.firstName());
        user.setMiddleName(userDTO.middleName());
        user.setLastName(userDTO.lastName());
        user.setAge(userDTO.age());
        user.setEmail(userDTO.email());
        users.put(user.getId(),user);
        return user;
    }
}
