package com.microservice.productservice.service;

import com.microservice.productservice.dtos.ProductRequest;
import com.microservice.productservice.entity.Product;

public interface ProductService {
    Product createProduct(ProductRequest productRequest);
}
