package com.medflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class MedflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedflowApplication.class, args);
	}

}