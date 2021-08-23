package com.dbs.payment.response;

import com.dbs.payment.beans.Customer;

public class CustomerResponse {
	private Customer customer;

	public CustomerResponse(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
