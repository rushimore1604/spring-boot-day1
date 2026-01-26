package com.rushi.demo.service;

import com.rushi.demo.entity.User;
import com.rushi.demo.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getSortedUsers(String sortBy) {
        return userRepository.findAll(Sort.by(sortBy).ascending());
    }

    public List<User> searchByName(String name) {
        return userRepository.findByNameContainingIgnoreCase(name);
    }

    public List<User> filterByMinAge(int minAge) {
        return userRepository.findByAgeGreaterThanEqual(minAge);
    }
}
