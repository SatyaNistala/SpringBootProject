package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootEurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaProducerApplication.class, args);
	}
}
