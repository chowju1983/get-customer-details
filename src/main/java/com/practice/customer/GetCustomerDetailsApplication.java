package com.practice.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import com.practice.customer.exception.ExceptionVO;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class GetCustomerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetCustomerDetailsApplication.class, args);
	}
	
	@Bean
	public ExceptionVO exceptionBean() {
		return new ExceptionVO();
	}
}
