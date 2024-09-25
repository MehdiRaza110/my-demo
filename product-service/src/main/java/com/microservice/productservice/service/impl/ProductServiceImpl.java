package com.microservice.productservice.service.impl;

import com.microservice.productservice.dtos.ProductRequest;
import com.microservice.productservice.entity.Product;
import com.microservice.productservice.repository.ProductRepository;
import com.microservice.productservice.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductRequest productRequest) {
        Product product=new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());

        Product save = productRepository.save(product);
       log.info("Product {} is saved", product.getId());
       return save;
    }
}
