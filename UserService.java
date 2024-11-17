package com.agrihub.backend.service;

import com.agrihub.backend.model.User;
import com.agrihub.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method for logging in a user
    public User loginUser(String email, String password) {
        // Find user by email
        User user = userRepository.findByEmail(email);
        
        // If user exists and password matches
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        
        // Return null if login fails (you can throw an exception if preferred)
        return null;
    }

    // Method for registering a new user
    public User registerUser(User user) {
        // Save the user to the database and return the saved user object
        return userRepository.save(user);
    }
}
