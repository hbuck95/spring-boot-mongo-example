package com.bae.repository;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public String accountNumber = null;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = generateAccountNumber();
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s', accNo='%s']", id, firstName, lastName,
				accountNumber);
	}

	private String generateAccountNumber() {
		return RandomStringUtils.randomAlphanumeric(10);
	}

}