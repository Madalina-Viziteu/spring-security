package com.demo.springsecurity.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class AccountNotFoundException extends RuntimeException{

    public AccountNotFoundException(Integer accountId){
        super("Account not found for id " + accountId);
    }
}
