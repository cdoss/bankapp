package com.cdoss.bank.account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckingAccountTest {

	@Test
	public void getCheckingAccountType() {
		Account account = new CheckingAccount(0.00);
		assertEquals(AccountTypeEnum.CHECKING, account.getAccountType());
	}

}
