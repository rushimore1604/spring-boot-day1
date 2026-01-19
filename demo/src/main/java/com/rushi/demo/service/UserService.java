package com.rushi.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import java.util.List;

import com.rushi.demo.UserRequest;
import com.rushi.demo.UserResponse;
import com.rushi.demo.entity.User;
import com.rushi.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String hello() {
        return "Hello! Spring Boot Day 2 🚀";
    }

    public String status() {
        return "Application is running successfully";
    }

    public String time() {
        return "Current server time: " + LocalDateTime.now();
    }

    public UserResponse createUser(UserRequest userRequest) {

        User user = new User(userRequest.getName(), userRequest.getAge());

        User savedUser = userRepository.save(user);

        return new UserResponse(
                "User saved successfully with ID: " + savedUser.getId(),
                savedUser.getName(),
                savedUser.getAge()
        );
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User updateUser(Long id, UserRequest request) {

        User existingUser = getUserById(id);

        existingUser.setName(request.getName());
        existingUser.setAge(request.getAge());

        return userRepository.save(existingUser);
    }

    public String deleteUser(Long id) {

        User existingUser = getUserById(id);

        userRepository.delete(existingUser);

        return "User deleted successfully with id: " + id;
    }
}
