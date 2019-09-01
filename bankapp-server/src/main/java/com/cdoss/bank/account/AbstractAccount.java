package com.cdoss.bank.account;

public abstract class AbstractAccount implements Account {

	private double balance = 0.00;

	public AbstractAccount(double deposit) {
		this.balance = deposit;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdraw(double withdrawal) {
		balance -= withdrawal;
	}
}
