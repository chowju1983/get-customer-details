package com.practice.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.practice.customer.CustomerMessages;
import com.practice.customer.domain.Address;
import com.practice.customer.domain.Customer;
import com.practice.customer.exception.CustomerException;
import com.practice.customer.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerController {
	
	@Autowired
	private CustomerMessages messages;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@GetMapping("/get/customer/details/{customerName}")
	@HystrixCommand(fallbackMethod="handleException")
	public Object getCustomerDetails(@PathVariable("customerName")String name) throws Exception {
		log.debug("Fetching customer details");
		Optional<Customer> customer = customerRepo.findCustomerByCustomerName(name);
		if(customer.isPresent()) {
			return customer;
		}
		
		System.out.println("*****************"+messages.getWelcome());
		throw new Exception("Resource Not Found");
		
	}
	
	
	public Object handleException(String message) throws CustomerException {
		throw new CustomerException("Resource Unavailable");
	}

}
