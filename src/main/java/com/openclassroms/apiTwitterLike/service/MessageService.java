package com.openclassroms.apiTwitterLike.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassroms.apiTwitterLike.model.Message;
import com.openclassroms.apiTwitterLike.repository.MessageRepository;

import lombok.Data;

@Service
@Data
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;
	
	
	// return list of all messages
	public Iterable<Message> getAllMessage() {
		return messageRepository.findAll();
	}
	
	// create message
	public Message createMessage(Message message) {
		return messageRepository.save(message);
	}
	
	
}
