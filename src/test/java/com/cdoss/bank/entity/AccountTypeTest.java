package com.cdoss.bank.entity;

import org.junit.Assert;
import org.junit.Test;

import com.cdoss.bank.account.AccountTypeEnum;

public class AccountTypeTest {

	public AccountTypeTest() {

	}

	AccountType accountType;

	@Test
	public void accountTypeIsCheckingTest() {
		accountType = new AccountType(AccountTypeEnum.CHECKING);
		accountType.setId(10);
		Enum<AccountTypeEnum> type = accountType.getName();
		Assert.assertEquals(10, accountType.getId());
		Assert.assertEquals(AccountTypeEnum.CHECKING, type);
	}

	@Test
	public void accountTypeIsSavingsTest() {
		accountType = new AccountType(AccountTypeEnum.SAVINGS);
		accountType.setId(20);
		Enum<AccountTypeEnum> type = accountType.getName();
		Assert.assertEquals(20, accountType.getId());
		Assert.assertEquals(AccountTypeEnum.SAVINGS, type);
	}
}
