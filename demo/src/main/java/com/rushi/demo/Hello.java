package com.rushi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rushi.demo.service.UserService;

import jakarta.validation.Valid;

@RestController
public class Hello {

    private final UserService userService;

    public Hello(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return userService.hello();
    }

    @GetMapping("/status")
    public String status() {
        return userService.status();
    }

    @GetMapping("/time")
    public String time() {
        return userService.time();
    }

    @PostMapping("/user")
    public UserResponse createUser(@Valid @RequestBody UserRequest user) {
        return userService.createUser(user);
    }
}
