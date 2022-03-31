package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByName (String name);
    List<User> getAllUsers();
}
