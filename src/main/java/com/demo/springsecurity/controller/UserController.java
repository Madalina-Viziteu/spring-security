package com.demo.springsecurity.controller;

import com.demo.springsecurity.repository.UserRepository;
import com.demo.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

//    @GetMapping(value = "/all-users")
//    public List<User> getAllUsers() {
//        return userRepository.getAllUsers();
//    }

//    @PostMapping("/user/create")
//    public void createUser(User user){
//        userService.createUser(user);
//    }

}
