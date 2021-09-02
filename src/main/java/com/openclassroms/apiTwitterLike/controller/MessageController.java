package com.openclassroms.apiTwitterLike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
