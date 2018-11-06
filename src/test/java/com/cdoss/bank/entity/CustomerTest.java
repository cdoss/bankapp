package com.cdoss.bank.entity;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	public CustomerTest() {

	}

	@Test
	public void customerModelTest() {

		Customer customer = new Customer();
		customer.setId(20);
		customer.setFirstName("Chandy");
		customer.setMiddleInitial("S");
		customer.setLastName("Doss");
		customer.setSuffix(null);

		Assert.assertEquals(20, customer.getId());
		Assert.assertEquals("Chandy", customer.getFirstName());
		Assert.assertEquals("S", customer.getMiddleInitial());
		Assert.assertEquals("Doss", customer.getLastName());
		Assert.assertNull(customer.getSuffix());
	}
}
