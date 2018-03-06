package com.cdoss.bank.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	private Account account;

	@Before
	public void setUp() {
		account = new CheckingAccount(0.00);
	}

	@After
	public void tearDown() {
		account = null;
	}

	@Test
	public void createBankAccount() {
		assertNotNull(account);
	}

	@Test
	public void checkBalanaceOfNewAccount() {
		assertEquals(0.00, account.getBalance(), 0.00);
	}

	@Test
	public void depositMoneyIntoAccount() {
		account.deposit(100.00);
		assertEquals(100.00, account.getBalance(), 0.00);
	}

	@Test
	public void withdrawMoneyFromAccount() {
		account = new CheckingAccount(100.00);
		account.withdraw(50.00);
		assertEquals(50.00, account.getBalance(), 0.00);
	}

}
