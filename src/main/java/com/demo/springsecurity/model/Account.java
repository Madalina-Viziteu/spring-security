package com.demo.springsecurity.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String accountNumber;
    private LocalDate creationDate;
    private Double balance;
    private Currency currency;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "sourceAccount")
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "targetAccount")
    private List<Transaction> targetTransactions;

}