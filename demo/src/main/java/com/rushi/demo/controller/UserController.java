package com.rushi.demo.controller;

import com.rushi.demo.entity.User;
import com.rushi.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sorted")
    public List<User> getSortedUsers(@RequestParam(defaultValue = "id") String sortBy) {
        return userService.getSortedUsers(sortBy);
    }

    @GetMapping("/search")
    public List<User> searchByName(@RequestParam String name) {
        return userService.searchByName(name);
    }

    @GetMapping("/age")
    public List<User> filterByAge(@RequestParam int minAge) {
        return userService.filterByMinAge(minAge);
    }
}
