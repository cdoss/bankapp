package com.cdoss.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdoss.bank.entity.Account;
import com.cdoss.bank.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(value = "/accounts")
	public List<Account> getAllAccounts(){
		return this.accountService.getAllAccounts();
	}
	
	@GetMapping(value = "/accounts/{id}")
	public Account getAccount(@PathVariable("id") int id) {
		return this.accountService.getAccount(id);
	}
}
