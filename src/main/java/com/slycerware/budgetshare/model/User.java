package com.slycerware.budgetshare.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    @ManyToMany
    @JoinColumn(name = "user_list")
    private List<Budget> budget_list;

    @OneToMany
    @JoinColumn(name = "owner")
    private List<Budget> owned_list;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @OneToMany
    @JoinColumn(name = "initiator")
    private List<Transaction> transactions;
}
