package com.Sebastiao.springbootclothesseller.model;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Ricardo
 * @date 30.11.2023
 * @time 18:48
 */

//Below it can be found Hibernate Entity, Table, Column, etc
// Hibernate is link between the DB on MySQL and this program
@Data
@Entity
@Table(name = "product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "stockCount", nullable = false)
    private int stockCount;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    //private Set<Purchase> purchaseList;

}
