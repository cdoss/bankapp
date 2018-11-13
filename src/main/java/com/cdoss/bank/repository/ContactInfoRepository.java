package com.cdoss.bank.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdoss.bank.entity.ContactInfo;

public interface ContactInfoRepository extends CrudRepository<ContactInfo, Integer> {

}
