package com.demo.springsecurity.api.rest.controller;

import com.demo.springsecurity.model.AccountNotFoundException;
import com.demo.springsecurity.model.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ControllerAdvice {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(AccountNotFoundException.class)
    @GetMapping(value = "/accounts/{id}")
    public AccountNotFoundException accountError(@PathVariable("id") Integer id){
        return new AccountNotFoundException(id);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    @GetMapping(value = "/users/{email}")
    public UserNotFoundException userError(@PathVariable("email") String email){
        return new UserNotFoundException(email);
    }
}
