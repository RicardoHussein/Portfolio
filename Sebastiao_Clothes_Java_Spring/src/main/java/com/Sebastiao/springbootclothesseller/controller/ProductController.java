package com.Sebastiao.springbootclothesseller.controller;

import com.Sebastiao.springbootclothesseller.model.Product;
import com.Sebastiao.springbootclothesseller.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
    }

    @DeleteMapping("{productID}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productID){
        productService.deleteProduct(productID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getALlProducts(){
        return new ResponseEntity<>(productService.findAllProducts(),HttpStatus.OK);
    }
}
