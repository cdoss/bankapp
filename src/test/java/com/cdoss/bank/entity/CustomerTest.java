package com.cdoss.bank.entity;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	public CustomerTest() {

	}

	@Test
	public void customerModelTest() {

		Customer customer = new Customer("Chandy", "S", "Doss", null);
		customer.setId(20);

		Assert.assertEquals(20, customer.getId());
		Assert.assertEquals("Chandy", customer.getFirstName());
		Assert.assertEquals("S", customer.getMiddleInitial());
		Assert.assertEquals("Doss", customer.getLastName());
		Assert.assertNull(customer.getSuffix());
	}
}
