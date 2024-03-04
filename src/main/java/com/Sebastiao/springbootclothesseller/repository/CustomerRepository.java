package com.Sebastiao.springbootclothesseller.repository;

import com.Sebastiao.springbootclothesseller.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
