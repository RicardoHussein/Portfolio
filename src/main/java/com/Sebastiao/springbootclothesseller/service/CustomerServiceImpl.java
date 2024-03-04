package com.Sebastiao.springbootclothesseller.service;

import com.Sebastiao.springbootclothesseller.model.Customer;
import com.Sebastiao.springbootclothesseller.model.Product;
import com.Sebastiao.springbootclothesseller.repository.CustomerRepository;
import com.Sebastiao.springbootclothesseller.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer)
    {
        customer.setCreateTime(LocalDateTime.now());

        return this.customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long ID)
    {
        customerRepository.deleteById(ID);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        return customerRepository.findAll();
    }

}
