package com.cdoss.bank.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdoss.bank.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
