package com.demo.springsecurity.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends RuntimeException{

    public AccountNotFoundException(){
        super("Account does not exist");
    }
}