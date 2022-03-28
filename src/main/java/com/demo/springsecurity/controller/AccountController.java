package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.Transaction;
import com.demo.springsecurity.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/accounts")
    public String getAccounts() {
        return " accounts ";
    }

    @PostMapping("/account/add")
    public void createAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

}
