package com.dto.mapstruct.dtomapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.dto.mapstruct.dtomapstruct.infraestructure.repository")
@EntityScan(basePackages = { "com.dto.mapstruct.dtomapstruct.domain" })
public class DtomapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtomapstructApplication.class, args);
	}

}
