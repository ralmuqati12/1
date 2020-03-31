package com.example.Watheq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.example.Watheq"})
public class WatheqApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatheqApplication.class, args);
	}

}
