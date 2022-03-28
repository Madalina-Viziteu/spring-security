package com.demo.springsecurity.mapper;

import com.demo.springsecurity.dto.AccountDto;
import com.demo.springsecurity.model.Account;
import com.demo.springsecurity.model.Currency;
import com.demo.springsecurity.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AccountMapper {

    public Account map(AccountDto accountDto, User user) {
        Account account = new Account();
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setBalance(Double.valueOf(accountDto.getBalance()));
        account.setCurrency(Currency.valueOf(accountDto.getCurrency()));
        account.setCreationDate(LocalDate.now());
        account.setUser(user);
        return account;

    }


}
