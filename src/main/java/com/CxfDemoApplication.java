package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring/application.xml"})
public class CxfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CxfDemoApplication.class, args);
	}
}
