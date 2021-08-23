package com.dbs.payment.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferTypes {

	@Id
	private String transfertypecode;
	private String transfertypedescription;
	
	public TransferTypes() {
		// TODO Auto-generated constructor stub
	}

	public TransferTypes(String transfertypecode, String transfertypedescription) {
		super();
		this.transfertypecode = transfertypecode;
		this.transfertypedescription = transfertypedescription;
	}

	public String getTransfertypecode() {
		return transfertypecode;
	}

	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}

	public String getTransfertypedescription() {
		return transfertypedescription;
	}

	public void setTransfertypedescription(String transfertypedescription) {
		this.transfertypedescription = transfertypedescription;
	}
	
	
}
