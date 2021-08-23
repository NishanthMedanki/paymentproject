package com.dbs.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.beans.Logger;
import com.dbs.payment.beans.Transaction;
import com.dbs.payment.beans.repository.LoggerRepository;

@Service
public class LoggerService {
	@Autowired
	private LoggerRepository loggerepo;
	
	public boolean addLogger(Logger logger) throws Exception {
		try {
			
			this.loggerepo.save(logger);
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
