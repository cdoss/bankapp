package com.cdoss.bank.account.it;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IntergrationTest {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void test() {
		Customer customer = new Customer();
		customer.setFirstName("Jane");
		customer.setLastName("Doe");

		customerRepository.save(customer);
		List<Customer> list = customerRepository.findAll();
		System.out.println("Customers: " + list.toString());
		customer = customerRepository.findById(1);
		Assert.assertEquals("Jane", customer.getFirstName());
	}

}
