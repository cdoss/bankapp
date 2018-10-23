package com.cdoss.bank.account;

public class SavingsAccount extends AbstractAccount {

	public SavingsAccount(double deposit) {
		super(deposit);
	}

	public Enum<AccountType> getAccountType() {
		return AccountType.SAVINGS;
	}

}
