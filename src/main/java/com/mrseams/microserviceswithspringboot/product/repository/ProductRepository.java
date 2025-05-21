package com.mrseams.microserviceswithspringboot.repository;

import com.mrseams.microserviceswithspringboot.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
