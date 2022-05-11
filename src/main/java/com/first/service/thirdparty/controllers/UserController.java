package com.first.service.thirdparty.controllers;

import com.first.service.thirdparty.exceptions.UserNotFoundException;
import com.first.service.thirdparty.models.User;
import com.first.service.thirdparty.repositories.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id){
        return userRepository
                .findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
