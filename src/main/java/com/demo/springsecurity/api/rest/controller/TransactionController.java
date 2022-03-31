package com.demo.springsecurity.api.rest.controller;

import com.demo.springsecurity.model.Transaction;
import com.demo.springsecurity.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/add")
    public void createTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
    }

    @DeleteMapping("/transactions/{id}")
    public void deleteAccount(@PathVariable("id") Integer id) {
        transactionService.deleteTransaction(id);
    }
}
