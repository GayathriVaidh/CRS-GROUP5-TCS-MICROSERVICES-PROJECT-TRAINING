package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableWebMvc
public class CrsTcsMicroserviceDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsTcsMicroserviceDevelopmentApplication.class, args);
	}

}