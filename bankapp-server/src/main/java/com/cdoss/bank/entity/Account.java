package com.cdoss.bank.entity;

import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	public Account() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "balance")
	private Currency balance;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "is_frozen")
	private boolean isFrozen;
	@Column(name = "is_overdrafted")
	private boolean isOverdrafted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Currency getBalance() {
		return balance;
	}

	public void setBalance(Currency balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isFrozen() {
		return isFrozen;
	}

	public void setFrozen(boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

	public boolean isOverdrafted() {
		return isOverdrafted;
	}

	public void setOverdrafted(boolean isOverdrafted) {
		this.isOverdrafted = isOverdrafted;
	}

}
