package com.dbs.payment.beans.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.payment.beans.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}
