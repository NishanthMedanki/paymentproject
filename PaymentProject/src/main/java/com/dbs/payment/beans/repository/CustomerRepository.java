package com.dbs.payment.beans.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.payment.beans.Customer;



public interface CustomerRepository extends CrudRepository<Customer, String> {

}
