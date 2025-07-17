package com.slycerware.budgetshare.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    // user_list <- many/many -> budget_list
    @ManyToMany
    @JoinTable(name = "user_budget",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "budget_id"))
    private List<Budget> budget_list;

    @OneToMany(mappedBy = "owner")
    private List<Budget> owned_list;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "initiator")
    private List<Transaction> transactions;
}
