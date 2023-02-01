package com.rohit.db.repository;

import com.rohit.db.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

