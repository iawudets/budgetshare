package com.slycerware.budgetshare.model;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long budget_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "public")
    private Boolean isPublic;

    @Column(name = "date_created")
    private Date date_created;

    @Column(name = "date_modified")
    private Date date_modified;

    @OneToMany(mappedBy="budget")
    private List<Transaction> transactions;

    @Column(name = "shared_num")
    private int shared_num;

    // budget_list <- many/many -> user_list
    @ManyToMany(mappedBy = "budget_list")
    private List<User> user_list;

    @ManyToOne
    @JoinColumn(name = "owned_list")
    private User owner;
}