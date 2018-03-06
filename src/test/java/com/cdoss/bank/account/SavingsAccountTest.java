package com.cdoss.bank.account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SavingsAccountTest {

	@Test
	public void getSavingsAccountType() {
		Account account = new SavingsAccount(0.00);
		assertEquals(AccountType.SAVINGS, account.getAccountType());
	}

}
