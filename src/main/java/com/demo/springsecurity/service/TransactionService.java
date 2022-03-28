package com.demo.springsecurity.service;

import com.demo.springsecurity.dto.TransactionDto;
import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.Transaction;
import com.demo.springsecurity.repository.AccountRepository;
import com.demo.springsecurity.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;

//    public void addTransaction(TransactionDto transactionDto) {
//        Transaction transaction = new Transaction();
//        transaction.setAmount(Double.valueOf(transactionDto.getAmount()));
//        transaction.setDateTime(LocalDateTime.now());
//        Optional<Account> optionalSourceAccount = accountRepository.findByAccountNumber(transactionDto.getSourceAccount());
//        transaction.setSourceAccount(optionalSourceAccount.get());
//        Optional<Account> optionalTargetAccount = accountRepository.findByAccountNumber(transactionDto.getTargetAccount());
//        transaction.setTargetAccount(optionalTargetAccount.get());
//        // TODO: 3/28/2022 method withdraw money from source account and put it into target account
//        transactionRepository.save(transaction);
//    }

    public void addTransaction(Transaction transaction) {
       transactionRepository.save(transaction);
    }
}
