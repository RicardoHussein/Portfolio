package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.Customer;
import com.Sebastiao.springbootclothesseller.model.Salesperson;

import java.util.List;
public interface CustomerService {
    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long ID);

    List<Customer> findAllCustomers();
}
