package com.openclassroms.apiTwitterLike.service;


import java.util.Optional;

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
	
	// get one message
	public Optional<Message> getOneMessage(Long id) {
		return messageRepository.findById(id);
	}
	
	//update message
	public Message updateMessage(Message message, Long id) {
		Message msg = messageRepository.findById(id).orElseThrow();
		
		msg.setMessage(message.getMessage());
		msg.setPublictionDate(message.getPublictionDate());
		msg.setUsername(message.getUsername());
		
		return msg;	
	}
	
	
	public void deleteMessage(Long id) {
		messageRepository.deleteById(id);
	}
}
