package com.cdoss.bank.account.it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cdoss.bank.entity.ContactInfo;
import com.cdoss.bank.repository.ContactInfoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ContactInfoRepositoryIT {

	@Autowired
	private ContactInfoRepository contactInfoRepo;
	
	@Test
	public void newContactInfoSaveIT() {
		
		ContactInfo contactInfo =  new ContactInfo();
		contactInfo.setCustomerId(2);
		contactInfo.setAddress("123 Tabor Rd");
		contactInfo.setEmailAddress("janedoe19120@gmail.com");
		contactInfo.setCity("Lynn");
		contactInfo.setState("MA");
		contactInfo.setZipCode("01902");
		contactInfo.setCellPhone("987-123-9485");
		contactInfoRepo.save(contactInfo);
		
		ContactInfo contact = contactInfoRepo.findById(2).get();
		Assert.assertEquals("123 Tabor Rd", contact.getAddress());
		Assert.assertEquals("janedoe19120@gmail.com", contact.getEmailAddress());
		Assert.assertEquals("Lynn", contact.getCity());
		Assert.assertEquals("MA", contact.getState());
		Assert.assertEquals("01902", contact.getZipCode());
		Assert.assertEquals("987-123-9485", contact.getCellPhone());
	}
}
