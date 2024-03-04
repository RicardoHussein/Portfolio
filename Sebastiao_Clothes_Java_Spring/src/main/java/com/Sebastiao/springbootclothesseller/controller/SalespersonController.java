package com.Sebastiao.springbootclothesseller.controller;

import com.Sebastiao.springbootclothesseller.model.Salesperson;
import com.Sebastiao.springbootclothesseller.service.SalespersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/salesperson")
@RequiredArgsConstructor
public class SalespersonController {
    private final SalespersonService salespersonService;


    @PostMapping
    public ResponseEntity<?> saveSalesperson(@RequestBody Salesperson salesperson){
        return new ResponseEntity<>(salespersonService.saveSalesperson(salesperson),HttpStatus.CREATED);
    }

    @DeleteMapping("{salespersonID}")
    public ResponseEntity<?> deleteSalesperson(@PathVariable Long salespersonID){
        salespersonService.deleteSalesperson(salespersonID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getALlSalespeople(){
        return new ResponseEntity<>(salespersonService.findAllSalesperson(),HttpStatus.OK);
    }
}
