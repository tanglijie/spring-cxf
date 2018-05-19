package com;

import com.config.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ServletComponentScan
@ImportResource(locations = {"classpath:spring/application.xml"})
public class ProducerApplication {

	@Bean
	public ServletRegistrationBean MyServlet1(){
		return new ServletRegistrationBean(new MyServlet(),"/user/*");
	}

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
