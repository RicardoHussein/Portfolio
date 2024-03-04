package com.Sebastiao.springbootclothesseller.repository;

import com.Sebastiao.springbootclothesseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long>
{
}
