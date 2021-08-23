package com.dbs.payment.beans.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.payment.beans.Bank;

public interface BankRepository extends CrudRepository<Bank, String> {

}
