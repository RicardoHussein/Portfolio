package com.Sebastiao.springbootclothesseller.model;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Ricardo
 * @date 30.11.2023
 * @time 18:46
 */

//Below it can be found Hibernate Entity, Table, Column, etc
// Hibernate is link between the DB on MySQL and this program
@Data
@Entity
@Table(name = "purchase")

public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)//It is only for foreign key.
    private User user;

    @Column(name = "product_id", nullable = false)
    private Long product_id;

    @ManyToOne(fetch = FetchType.LAZY) // From my understanding it should be one to many
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;

    @Column(name = "customer_id", nullable = true)
    private Long customer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Customer customer;

    @Column(name = "store_id", nullable = true)
    private Long store_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Store store;

    @Column(name = "salesperson_id", nullable = true)
    private Long salesperson_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salesperson_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Salesperson salesperson;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;

}
