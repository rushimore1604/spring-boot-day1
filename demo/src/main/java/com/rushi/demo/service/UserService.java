package com.rushi.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.rushi.demo.UserRequest;
import com.rushi.demo.UserResponse;

@Service
public class UserService {

    public String hello() {
        return "Hello! Spring Boot Day 2 🚀";
    }

    public String status() {
        return "Application is running successfully";
    }

    public String time() {
        return "Current server time: " + LocalDateTime.now();
    }

    public UserResponse createUser(UserRequest user) {
        return new UserResponse(
                "User created successfully",
                user.getName(),
                user.getAge()
        );
    }
}
