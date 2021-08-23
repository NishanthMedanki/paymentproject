package com.dbs.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport;
import org.springframework.stereotype.Service;

import com.dbs.payment.beans.Bank;
import com.dbs.payment.beans.Transaction;
import com.dbs.payment.beans.repository.TransactionRepository;



@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transrepo;
	
	public boolean searchTransactionById(int transid) throws Exception
	{
		try {
			if(this.transrepo.findById(transid).isPresent())
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
	
	public boolean addTransaction(Transaction transaction) throws Exception {
		try {
			
			this.transrepo.save(transaction);
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
