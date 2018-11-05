package com.cdoss.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_info")
public class ContactInfo {

	public ContactInfo() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "address")
	private String address;
	@Column(name = "address2")
	private String address2;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip_code")
	private int zipCode;
	@Column(name = "home_phone")
	private String homePhone;
	@Column(name = "business_phone")
	private String businessPhone;
	@Column(name = "cell_phone")
	private String cellPhone;
	@Column(name = "fax_number")
	private String faxNumber;
	@Column(name = "email_address")
	private String emailAddress;
}
