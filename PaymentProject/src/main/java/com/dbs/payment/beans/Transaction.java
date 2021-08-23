package com.dbs.payment.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private Bank senderbic;
	@ManyToOne
	private Bank receiverbic;
	private String receiveraccountholdernumber;
	private String receiveraccountholdername;
	@ManyToOne
	private TransferTypes transfertypecode;
	@ManyToOne
	private Message messagecode;
	private double currencyamount;
	private double transferfees;
	private Date transferdate;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
		System.out.println("in transaction");
	}

	public Transaction(int transactionid, Customer customer, Bank senderbic, Bank receiverbic,
			String receiveraccountholdernumber, String receiveraccountholdername, TransferTypes transfertypecode,
			Message messagecode, double currencyamount, double transferfees, Date transferdate) {
		super();
		this.transactionid = transactionid;
		this.customer = customer;
		this.senderbic = senderbic;
		this.receiverbic = receiverbic;
		this.receiveraccountholdernumber = receiveraccountholdernumber;
		this.receiveraccountholdername = receiveraccountholdername;
		this.transfertypecode = transfertypecode;
		this.messagecode = messagecode;
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.transferdate = transferdate;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Bank getSenderbic() {
		return senderbic;
	}

	public void setSenderbic(Bank senderbic) {
		this.senderbic = senderbic;
	}

	public Bank getReceiverbic() {
		return receiverbic;
	}

	public void setReceiverbic(Bank receiverbic) {
		this.receiverbic = receiverbic;
	}

	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}

	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}

	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}

	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}

	public TransferTypes getTransfertypecode() {
		return transfertypecode;
	}

	public void setTransfertypecode(TransferTypes transfertypecode) {
		this.transfertypecode = transfertypecode;
	}

	public Message getMessagecode() {
		return messagecode;
	}

	public void setMessagecode(Message messagecode) {
		this.messagecode = messagecode;
	}

	public double getCurrencyamount() {
		return currencyamount;
	}

	public void setCurrencyamount(double currencyamount) {
		this.currencyamount = currencyamount;
	}

	public double getTransferfees() {
		return transferfees;
	}

	public void setTransferfees(double transferfees) {
		this.transferfees = transferfees;
	}

	public Date getTransferdate() {
		return transferdate;
	}

	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}
	
	
	
}
