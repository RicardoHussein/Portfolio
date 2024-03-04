package com.Sebastiao.springbootclothesseller.model;

import lombok.Data;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Ricardo
 * @date 30.11.2023
 * @time 18:48
 */

//Below it can be found Hibernate Entity, Table, Column, etc
// Hibernate is link between the DB on MySQL and this program
@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "user_ID", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_ID", referencedColumnName = "ID", insertable = false, updatable = false)//It is only for foreign key.
    private User user;

    @Column(name = "username", nullable = true, length = 100)// Consider if username should be unique
    private String username;

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Column(name = "country", nullable = false)
    private String country;

}
