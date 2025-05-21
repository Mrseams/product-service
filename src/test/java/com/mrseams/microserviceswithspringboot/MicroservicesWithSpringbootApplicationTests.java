package com.mrseams.microserviceswithspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MicroservicesWithSpringbootApplicationTests {

	@Test
	void contextLoads() {
	}

}
