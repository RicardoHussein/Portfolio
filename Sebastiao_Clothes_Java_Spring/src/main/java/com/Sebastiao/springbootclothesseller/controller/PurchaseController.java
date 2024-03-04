package com.Sebastiao.springbootclothesseller.controller;

import com.Sebastiao.springbootclothesseller.model.Purchase;
import com.Sebastiao.springbootclothesseller.security.UserPrinciple;
import com.Sebastiao.springbootclothesseller.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PurchaseController {
    private final PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchaseOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple){
        return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrinciple.getID()));
    }
}
