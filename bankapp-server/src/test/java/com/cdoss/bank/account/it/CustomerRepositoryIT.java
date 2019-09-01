package com.cdoss.bank.account.it;

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
public class CustomerRepositoryIT {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void newCustomerSavetest() {
		Customer customer = new Customer("Chandy", "S", "Doss", null);
		customerRepository.save(customer);

		customer = customerRepository.findById(3);
		Assert.assertEquals("Chandy", customer.getFirstName());
		Assert.assertEquals("S", customer.getMiddleInitial());
		Assert.assertEquals("Doss", customer.getLastName());
		Assert.assertNull(customer.getSuffix());
	}

}
