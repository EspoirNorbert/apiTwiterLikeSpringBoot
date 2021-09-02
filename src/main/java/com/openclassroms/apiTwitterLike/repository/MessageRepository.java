package com.openclassroms.apiTwitterLike.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassroms.apiTwitterLike.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
