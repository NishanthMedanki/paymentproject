package com.dbs.payment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.payment.beans.Message;
import com.dbs.payment.beans.repository.MessageRepository;

public class MeesageService {
	@Autowired
	private MessageRepository msgrepo;
	
	public List<Message> findAllMsg() {
		List<Message> collaterals = new ArrayList<Message>();
		this.msgrepo.findAll().forEach(collateral-> collaterals.add(collateral));
		return collaterals;
	}
	
	public boolean searchMsg(String msgid) throws Exception
	{
		try {
			if(this.msgrepo.findById(msgid).isPresent())
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
	
	public boolean addMsg(Message msg) throws Exception {

		try {
			if(this.searchMsg(msg.getMessagecode()))
			{
				return false;
			}
			this.msgrepo.save(msg);
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
