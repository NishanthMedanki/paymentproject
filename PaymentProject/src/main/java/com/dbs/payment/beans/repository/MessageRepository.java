package com.dbs.payment.beans.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.payment.beans.Message;

public interface MessageRepository extends CrudRepository<Message, String> {

}
