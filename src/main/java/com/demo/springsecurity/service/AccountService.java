package com.demo.springsecurity.service;

import com.demo.springsecurity.dto.AccountDto;
import com.demo.springsecurity.mapper.AccountMapper;
import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.User;
import com.demo.springsecurity.repository.AccountRepository;
import com.demo.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AccountService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    AccountRepository accountRepository;

    public void addAccount(AccountDto accountDto, String userEmail){
        Optional<User> optionalUser = userRepository.findByEmail(userEmail);
        Account account = accountMapper.map(accountDto, optionalUser.get());
        accountRepository.save(account);
    }
}
