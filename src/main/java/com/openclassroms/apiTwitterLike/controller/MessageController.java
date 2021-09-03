package com.openclassroms.apiTwitterLike.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openclassroms.apiTwitterLike.model.Message;
import com.openclassroms.apiTwitterLike.service.MessageService;

@RestController
public class MessageController {
  
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/messages")
	public Iterable<Message> findAll(){
		return messageService.getAllMessage();
	}
	
	@PostMapping("/messages")
	public Message createMessage(@RequestBody Message message) {
		return messageService.createMessage(message);
	}
	
	@GetMapping("/messages/{id}")
	public Optional<Message> getMessage(@PathVariable (value = "id") Long messageId) {
		return messageService.getOneMessage(messageId);
	}
	
	@PutMapping("/messages/{id}")
	public Message updateMessage(@PathVariable (value = "id") Long messageId, @RequestBody Message message) {
		return messageService.updateMessage(message, messageId);
	}
	
	@DeleteMapping("/messages/{id}")
	public void deleteMessage(@PathVariable (value = "id") Long messageId) {
		 messageService.deleteMessage(messageId);
	}
	
	
}
