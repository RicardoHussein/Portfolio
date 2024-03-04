package com.Sebastiao.springbootclothesseller.repository;
//import com.Sebastiao.springbootclothesseller.model.Customer;
import com.Sebastiao.springbootclothesseller.model.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {
}
