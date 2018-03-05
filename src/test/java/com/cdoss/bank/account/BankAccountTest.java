package com.cdoss.bank.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankAccountTest {

	private Account account;

	@Test
	public void createBankAccount() {
		account = new CheckingAccount();
		assertNotNull(account);
	}

	@Test
	public void checkBalanaceOfNewAccount() {
		account = new CheckingAccount();
		assertEquals(0.00, account.getBalance(), 0.00);
	}

	@Test
	public void depositMoneyIntoAccount() {
		account = new CheckingAccount();
		account.deposit(100.00);
		assertEquals(100.00, account.getBalance(), 0.00);
	}

}
