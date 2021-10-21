package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@EnableWebMvc
public class CrsTcsMicroservicesDevelopement1Application {

	public static void main(String[] args) {
		SpringApplication.run(CrsTcsMicroservicesDevelopement1Application.class, args);
	}

}
