package com.mrseams.microserviceswithspringboot.product.repository;

import com.mrseams.microserviceswithspringboot.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
