package com.dbs.payment.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String customerid;
	private String accountholdername;
	private boolean overdrafting;
	private double cleabalance;
	private String customeraddress;
	private String customercity;
	private boolean customertype;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("in customer");
	}

	public Customer(String customerid, String accountholdername, Boolean overdrafting, double cleabalance,
			String customeraddress, String customercity, Boolean customertype) {
		super();
		this.customerid = customerid;
		this.accountholdername = accountholdername;
		this.overdrafting = overdrafting;
		this.cleabalance = cleabalance;
		this.customeraddress = customeraddress;
		this.customercity = customercity;
		this.customertype = customertype;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public Boolean getOverdrafting() {
		return overdrafting;
	}

	public void setOverdrafting(Boolean overdrafting) {
		this.overdrafting = overdrafting;
	}

	public double getCleabalance() {
		return cleabalance;
	}

	public void setCleabalance(double cleabalance) {
		this.cleabalance = cleabalance;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}

	public Boolean getCustomertype() {
		return customertype;
	}

	public void setCustomertype(Boolean customertype) {
		this.customertype = customertype;
	}
	
	
	
}
