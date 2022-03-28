package com.demo.springsecurity.model;

import com.demo.springsecurity.model.Account;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDateTime dateTime;
    private Double amount;

    @ManyToOne
    @JoinColumn
    private Account sourceAccount;

    @ManyToOne
    @JoinColumn
    private Account targetAccount;
}
