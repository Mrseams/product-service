package com.mrseams.microserviceswithspringboot;

import org.springframework.boot.SpringApplication;

public class TestMicroservicesWithSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.from(MicroservicesWithSpringbootApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
