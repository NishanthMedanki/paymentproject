package com.dbs.payment.response;



import com.dbs.payment.beans.Customer;

public class ResponsePage {

	private int status;
	private String message;
	private Customer customer;
	
	

	public ResponsePage(int i, Customer customer) {
		// TODO Auto-generated constructor stub
		super();
		this.status=i;
		this.setCustomer(customer);
		
	}
	public ResponsePage(Customer customer) {
		// TODO Auto-generated constructor stub
		super();
		this.setCustomer(customer);
		
	}
	
	public ResponsePage(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponsePage [status=" + status + ", message=" + message + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
}
