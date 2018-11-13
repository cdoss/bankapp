package com.cdoss.bank.account.it;

import java.util.ArrayList;
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

	public IntergrationTest() {
		fakeCustomerList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Chandy");
		customer.setMiddleInitial("S");
		customer.setLastName("Doss");
		customer.setSuffix(null);
		fakeCustomerList.add(customer);

		// customerRepository = Mockito.mock(CustomerRepository.class);
		// Mockito.when(customerRepository.save(customer)).thenReturn(customer);
		// Mockito.when(customerRepository.findAll()).thenReturn(fakeCustomerList);
	}

	@Autowired
	CustomerRepository customerRepository;
	// @Mock
	// CustomerRepository customerRepository;
	List<Customer> fakeCustomerList;

	@Test
	public void test() {
		Customer customer = new Customer();
		customer.setFirstName("Chandy");
		customer.setMiddleInitial("S");
		customer.setLastName("Doss");
		customer.setSuffix(null);
		customerRepository.save(customer);

		customer = customerRepository.findById(3);
		Assert.assertEquals("Chandy", customer.getFirstName());
		Assert.assertEquals("S", customer.getMiddleInitial());
		Assert.assertEquals("Doss", customer.getLastName());
		Assert.assertNull(customer.getSuffix());
	}

}
