package com.dbs.payment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.beans.Customer;
import com.dbs.payment.beans.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custrepo;
	
	public boolean searchCustomer(String custid) throws Exception
	{
		try {
			if(this.custrepo.findById(custid).isPresent())
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
	
	public Customer findCustomer(String custid) throws EntityNotFoundException
	{
		
		Optional<Customer> customer = custrepo.findById(custid);
		if(customer==null) {
			throw new EntityNotFoundException("Loan Proposal not found");
		}
		//loan.ifPresent(l -> Hibernate.initialize(l.getCollaterals()));
		return customer.get();
	}
	
	public boolean addCustomer(Customer customer) throws Exception {
		try {
				if(this.custrepo.findById(customer.getCustomerid()).isPresent())
				{
					return false;
				}
			this.custrepo.save(customer);
			
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
	
	public boolean updateCustomer(Customer customer) throws Exception {

		try {
			if(this.custrepo.findById(customer.getCustomerid()).isPresent())
			{
				this.custrepo.save(customer);
				return true;
			}	
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

	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		this.custrepo.findAll().forEach(cust-> customers.add(cust));
		return customers;
	}

}
