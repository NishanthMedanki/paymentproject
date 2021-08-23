package com.dbs.payment.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.beans.Bank;
import com.dbs.payment.beans.repository.BankRepository;
import com.dbs.payment.beans.repository.MessageRepository;
import com.dbs.payment.beans.repository.TransferTypesRepository;

@Service
public class BICService {

	@Autowired
	private BankRepository bankrepo;
	
	@Autowired
	private TransferTypesRepository transferrepo;
	
	public Bank findBIC(String bicid) {
		Optional<Bank> bank = bankrepo.findById(bicid);
		if(bank==null) {
			throw new EntityNotFoundException("Loan Proposal not found");
		}
		//loan.ifPresent(l -> Hibernate.initialize(l.getCollaterals()));
		return bank.get();
	}
	
	public boolean searchBIC(String bicid) throws Exception
	{
		try {
			if(this.bankrepo.findById(bicid).isPresent())
				return true;
		}
		catch(IllegalArgumentException e)
		{
			throw new IllegalArgumentException(e);
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
		return false;
	}
	
	public boolean addBIC(Bank bic) throws Exception {

		try {
			if(this.searchBIC(bic.getBic()))
			{
				return false;
			}
			this.bankrepo.save(bic);
		}
		catch(IllegalArgumentException e)
		{
			throw new IllegalArgumentException(e);
		}
		catch(Exception e)
		{
			throw new Exception(e);
		}
		return true;
	}
}
