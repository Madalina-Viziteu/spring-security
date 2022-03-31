package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.Transaction;
import com.demo.springsecurity.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/accounts")
    public String getAccounts() {
        return " accounts ";
    }

    @PostMapping("/account/add")
    public void createAccount(@RequestBody Account account) {
        accountService.addAccount(account);
    }

    @DeleteMapping("/accounts/{id}")
    public void deleteAccount(@PathVariable("id") Integer id) {
        accountService.deleteAccount(id);
    }
}
