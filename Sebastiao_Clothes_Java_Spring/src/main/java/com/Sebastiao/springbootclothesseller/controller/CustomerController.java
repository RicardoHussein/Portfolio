package com.Sebastiao.springbootclothesseller.controller;

import com.Sebastiao.springbootclothesseller.model.Customer;
import com.Sebastiao.springbootclothesseller.security.UserPrinciple;
import com.Sebastiao.springbootclothesseller.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;


    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.saveCustomer(customer),HttpStatus.CREATED);
    }

    @DeleteMapping("{customerID}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long customerID){
        customerService.deleteCustomer(customerID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getALlCustomers(){
        return new ResponseEntity<>(customerService.findAllCustomers(),HttpStatus.OK);
    }
}
