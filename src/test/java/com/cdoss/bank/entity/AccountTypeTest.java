package com.cdoss.bank.entity;

import org.junit.Assert;
import org.junit.Test;

import com.cdoss.bank.account.AccountTypeEnum;

public class AccountTypeTest {

	public AccountTypeTest() {

	}

	AccountType accountType;

	@Test
	public void checkingAccountTypeTest() {
		accountType = new AccountType(AccountTypeEnum.CHECKING);
		accountType.setId(10);
		Enum<AccountTypeEnum> type = accountType.getName();
		Assert.assertEquals(10, accountType.getId());
		Assert.assertEquals(AccountTypeEnum.CHECKING, type);

		accountType = new AccountType();
		accountType.setName(AccountTypeEnum.SAVINGS);
		Assert.assertEquals(AccountTypeEnum.SAVINGS, accountType.getName());
	}
}
