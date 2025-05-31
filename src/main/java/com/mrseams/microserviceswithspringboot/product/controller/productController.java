package com.mrseams.microserviceswithspringboot.product.controller;

import com.mrseams.microserviceswithspringboot.product.dto.ProductDTO;
import com.mrseams.microserviceswithspringboot.product.model.Product;
import com.mrseams.microserviceswithspringboot.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class productController {

    private final ProductService PS;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO store(@RequestBody ProductDTO PR){
        return PS.createProduct(PR);
    }

    @GetMapping
    public List<ProductDTO> index(){
        return PS.getAllProducts();
    }
}
