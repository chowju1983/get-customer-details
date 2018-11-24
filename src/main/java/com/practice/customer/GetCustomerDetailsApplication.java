package com.practice.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetCustomerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetCustomerDetailsApplication.class, args);
	}
}
