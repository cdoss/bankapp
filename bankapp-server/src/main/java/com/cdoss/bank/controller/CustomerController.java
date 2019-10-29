package com.cdoss.bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.repository.CustomerRepository;

@RestController
public class CustomerController {

	public CustomerController() {

	}

	@Autowired
	private CustomerRepository repository;

	@GetMapping(value = "/customers")
	public List<Customer> findAllCustomers() {
		List<Customer> customers = new ArrayList<>();

		Iterable<Customer> results = this.repository.findAll();
		results.forEach(customer -> {
			customers.add(customer);
		});

		return customers;
	}
}
