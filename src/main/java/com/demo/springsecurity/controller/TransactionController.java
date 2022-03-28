package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Transaction;
import com.demo.springsecurity.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/add")
    public void createRentalAgency(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }
}
