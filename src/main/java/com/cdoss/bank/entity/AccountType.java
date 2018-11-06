package com.cdoss.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cdoss.bank.account.AccountTypeEnum;

@Entity
@Table(name = "account_type")
public class AccountType {

	public AccountType() {

	}

	public AccountType(AccountTypeEnum type) {
		name = type;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private Enum<AccountTypeEnum> name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Enum<AccountTypeEnum> getName() {
		return name;
	}

	public void setName(Enum<AccountTypeEnum> name) {
		this.name = name;
	}

}
