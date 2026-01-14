package com.rushi.demo;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Spring Boot Day 2";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully";
    }

    @GetMapping("/time")
    public String time() {
        return "Current server time: " + LocalDateTime.now();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody UserRequest user) {
        return "User " + user.getName() + " created successfully. Age: " + user.getAge();
    }
}

