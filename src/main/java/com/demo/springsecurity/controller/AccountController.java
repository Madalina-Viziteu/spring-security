package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {

    @GetMapping(value = "/accounts")
    public String getAccounts() {
        return " accounts ";
    }

}
