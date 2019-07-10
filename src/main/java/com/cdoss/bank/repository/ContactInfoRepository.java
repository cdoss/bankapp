package com.cdoss.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.bank.entity.ContactInfo;

@Repository
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Integer> {

}
