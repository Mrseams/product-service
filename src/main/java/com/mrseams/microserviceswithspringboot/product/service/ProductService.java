package com.mrseams.microserviceswithspringboot.product.service;

import com.mrseams.microserviceswithspringboot.product.dto.ProductDTO;
import com.mrseams.microserviceswithspringboot.product.model.Product;
import com.mrseams.microserviceswithspringboot.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepo;

    public ProductDTO createProduct(ProductDTO PR){

        Product product = Product.builder()
                .name(PR.name())
                .description(PR.description())
                .price(PR.price())
                .build();

        var res = productRepo.save(product);
        log.info("Product saved with id: {}", res);
        log.info("Product created with id: {}", product.getId());
        return new ProductDTO
                (
                        product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice()
                );
    }

    public List<ProductDTO> getAllProducts() {
        return productRepo
                .findAll()
                .stream()
                .map(p -> new ProductDTO
                        (
                                p.getId(),
                                p.getName(),
                                p.getDescription(),
                                p.getPrice()
                        )
                ).toList();
    }
}
