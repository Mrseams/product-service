package com.mrseams.microserviceswithspringboot;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.shaded.org.hamcrest.Matchers;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MicroservicesWithSpringbootApplicationTests {

    @ServiceConnection
    static MongoDBContainer mongoDbContainer = new MongoDBContainer("mongo:7.0.5");

    @LocalServerPort
    private Integer port;

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    static {
        mongoDbContainer.start();
    }

    @Test
    void shouldCreateProduct() {
        String requesBody = "{\"name\":\"Pixel 9\",\"description\":\"A test product\",\"price\":100}";
        RestAssured.given()
                .contentType("application/json")
                .body(requesBody)
                .when()
                .post("/api/products")
                .then()
                .statusCode(201);
    }

}
