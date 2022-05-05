package com.example.springsecurityjwttutorial.controllers;

import com.example.springsecurityjwttutorial.entity.User;
import com.example.springsecurityjwttutorial.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController // Marks the class a rest controller
@RequestMapping(path = "/api/admin") // Requests made to /api/auth/anything will be handles by this class
public class AdminController {

    // Injecting Dependencies
    @Autowired private UserRepo userRepo;

    // Defining the function to handle the GET route to fetch user information of the authenticated user
    @GetMapping("/users")
    public List<User> getUserList(){

        // Fetch and return user details
        return userRepo.findAll();
    }
}
