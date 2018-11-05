package com.cdoss.bank.account.it;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdoss.bank.entity.Customer;
import com.cdoss.bank.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IntergrationTest {

	@Resource
	private CustomerRepository customerRepository;
	
	@Test
	public void test() {
		Customer customer = customerRepository.findById(1);
		Assert.assertEquals("John", customer.getFirstName());
	}

}
