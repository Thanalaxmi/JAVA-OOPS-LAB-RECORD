package com.agrihub.backend.repository;

import com.agrihub.backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

// MongoRepository<User, String> means we are working with User documents and their id is of type String.
public interface UserRepository extends MongoRepository<User, String> {

    // Custom query method to find a user by their email.
    User findByEmail(String email);
}

