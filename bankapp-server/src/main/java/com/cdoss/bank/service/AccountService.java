package com.cdoss.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdoss.bank.entity.Account;
import com.cdoss.bank.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<Account>();

		Iterable<Account> results = this.accountRepository.findAll();
		results.forEach(account -> {
			accounts.add(account);
		});

		return accounts;
	}

	public Account getAccount(int id) {
		return this.accountRepository.findById(id).get();
	}
}
