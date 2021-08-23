package com.dbs.payment.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Logger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loggerid;
	@ManyToOne
	private Customer customer;
	private String screenname;
	private String action;
	private String ipaddress;
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}

	public Logger(int loggerid, Customer customer, String screenname, String action, String ipaddress) {
		super();
		this.loggerid = loggerid;
		this.customer = customer;
		this.screenname = screenname;
		this.action = action;
		this.ipaddress = ipaddress;
	}

	public int getLoggerid() {
		return loggerid;
	}

	public void setLoggerid(int loggerid) {
		this.loggerid = loggerid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	
	
}
