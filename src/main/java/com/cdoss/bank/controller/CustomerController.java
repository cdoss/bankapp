package com.cdoss.bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.repository.CustomerRepository;

@RestController
public class CustomerController {

	public CustomerController() {

	}

	@Autowired
	private CustomerRepository repository;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Iterable<Customer> results = this.repository.findAll();
		results.forEach(customer -> {
			customers.add(customer);
		});

		return customers;
	}
}
