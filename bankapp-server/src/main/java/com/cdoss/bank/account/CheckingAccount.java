package com.cdoss.bank.account;

public class CheckingAccount extends AbstractAccount {

	public CheckingAccount(double deposit) {
		super(deposit);
	}

	public Enum<AccountTypeEnum> getAccountType() {
		return AccountTypeEnum.CHECKING;
	}
}
