package com.demo.springsecurity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDto {

    private String sourceAccount;
    private String targetAccount;
    private String amount;
}
