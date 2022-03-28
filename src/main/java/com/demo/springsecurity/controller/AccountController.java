package com.demo.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {

    @GetMapping(value = "/addTransaction")
    public String getAddTransactionPage() {
        return "add transaction";
    }
}
