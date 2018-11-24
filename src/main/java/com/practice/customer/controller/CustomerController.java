package com.practice.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.customer.CustomerMessages;
import com.practice.customer.domain.Address;
import com.practice.customer.domain.Customer;
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
	public Object getCustomerDetails(@PathVariable("customerName")String name) throws Exception {
		log.debug("Fetching customer details");
		Customer customer = customerRepo.findCustomerByCustomerName(name);
		if(customer!=null) {
			return customer;
		}
		
		System.out.println("*****************"+messages.getWelcome());
		throw new Exception("Resource Not Found");
		
	}

}
