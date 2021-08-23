package com.dbs.payment.response;

import com.dbs.payment.beans.Bank;

public class BicResponse {
	private Bank bic;

	public BicResponse(Bank bic) {
		super();
		this.bic = bic;
	}

	public Bank getBic() {
		return bic;
	}

	public void setBic(Bank bic) {
		this.bic = bic;
	}
	
	
}
