package com.cdoss.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.repository.AccountRepository;
import com.cdoss.bank.repository.AccountTypeRepository;
import com.cdoss.bank.repository.ContactInfoRepository;
import com.cdoss.bank.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	public CustomerService(AccountRepository accountRepository, AccountTypeRepository accountTypeRepository,
			ContactInfoRepository contactInfoRepository, CustomerRepository customerRepository) {
		super();
		this.accountRepository = accountRepository;
		this.accountTypeRepository = accountTypeRepository;
		this.contactInfoRepository = contactInfoRepository;
		this.customerRepository = customerRepository;
	}

	private final AccountRepository accountRepository;
	private final AccountTypeRepository accountTypeRepository;
	private final ContactInfoRepository contactInfoRepository;
	private final CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();

		Iterable<Customer> results = this.customerRepository.findAll();
		results.forEach(customer -> {
			customers.add(customer);
		});

		return customers;
	}
	
	public Customer getCustomer(int customerId) {
		return this.customerRepository.findById(customerId).get();
	}
}
