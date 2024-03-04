package com.Sebastiao.springbootclothesseller.model;

import lombok.Data;

import jakarta.persistence.*;
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
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "post_address", nullable = false, length = 100)
    private String post_address;

    @Column(name = "country", nullable = false)
    private String country;


    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

}
