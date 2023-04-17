package org.assignment.JPA_Mappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpaMappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingsApplication.class, args);
	}

}
