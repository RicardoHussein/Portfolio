package com.Sebastiao.springbootclothesseller.controller;

import com.Sebastiao.springbootclothesseller.model.Store;
import com.Sebastiao.springbootclothesseller.security.UserPrinciple;
import com.Sebastiao.springbootclothesseller.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;


    @PostMapping
    public ResponseEntity<?> saveStore(@RequestBody Store store){
        return new ResponseEntity<>(storeService.saveStore(store),HttpStatus.CREATED);
    }

    @DeleteMapping("{storeID}")
    public ResponseEntity<?> deleteStore(@PathVariable Long storeID){
        storeService.deleteStore(storeID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getALlStores(){
        return new ResponseEntity<>(storeService.findAllStores(),HttpStatus.OK);
    }
}
