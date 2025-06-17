package com.slycerware.budgetshare.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transaction_id;

    @ManyToOne
    @JoinColumn(name="transactions")
    private Budget budget;

    @Column(name = "date_created")
    private Date date_created;

    @Column(name = "change")
    private float delta;

    @ManyToOne
    @JoinColumn(name = "transactions")
    private User initiator;
}
