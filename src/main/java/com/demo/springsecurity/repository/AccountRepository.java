package com.demo.springsecurity.repository;

import com.demo.springsecurity.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    boolean existsAccountByAccountNumber(String accountNumber);

    Optional<Account> findByAccountNumber(String accountNumber);

}
