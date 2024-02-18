package com.codigomorsa.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Startup {
	private static Logger logger = LoggerFactory.getLogger(Startup.class);

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
		logger.debug("mi mensaje debug");

	}

}
