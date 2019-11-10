package com.cdoss.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.service.CustomerService;

@RestController
public class CustomerController {

	public CustomerController() {

	}

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/customers")
	public List<Customer> findAllCustomers() {
		return customerService.findAllCustomers();
	}
	
	@GetMapping(value = "/customers/{id}")
	public Customer findCustomer(@PathVariable("id") int id) {
		return customerService.findCustomer(id);
	}
}
