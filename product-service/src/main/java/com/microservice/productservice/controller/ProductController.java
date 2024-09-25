package com.microservice.productservice.controller;

import com.microservice.productservice.dtos.ProductRequest;
import com.microservice.productservice.entity.Product;
import com.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping

    public ResponseEntity<?> createProduct(@RequestBody ProductRequest productRequest){

        Product prod= productService.createProduct(productRequest);

       return new ResponseEntity<>(prod,HttpStatus.CREATED);
    }
}
