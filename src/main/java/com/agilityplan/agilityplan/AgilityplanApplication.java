package com.agilityplan.agilityplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class AgilityplanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgilityplanApplication.class, args);
	}

	//TODO Integrar Exceptions
	//TODO Validaciones en los controller
}
