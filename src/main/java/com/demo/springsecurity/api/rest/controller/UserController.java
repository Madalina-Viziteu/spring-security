package com.demo.springsecurity.api.rest.controller;

import com.demo.springsecurity.dto.UserDto;
import com.demo.springsecurity.model.User;
import com.demo.springsecurity.repository.UserRepository;
import com.demo.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @GetMapping(value = "/home")
    public String getHomePage() {
        return "Home page";
    }

    @GetMapping(value = "/user")
    public String getUserPage() {
        return "user page";
    }

    @GetMapping(value = "/admin")
    public String getAdminPage() {
        return "admin page";
    }

    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @PostMapping("/user/create")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }

    //find user account
    @GetMapping("users/{id}/{accountId}")
    public String findUserAccount(@PathVariable Integer id, @PathVariable Integer accountId){
        return "my account";
    }
}
