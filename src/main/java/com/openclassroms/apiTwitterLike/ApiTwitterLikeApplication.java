package com.openclassroms.apiTwitterLike;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassroms.apiTwitterLike.model.Message;
import com.openclassroms.apiTwitterLike.repository.MessageRepository;

@SpringBootApplication
public class ApiTwitterLikeApplication implements CommandLineRunner {
	
	@Autowired
	private MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTwitterLikeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageRepository.save(new Message(null, "Luc Ouedraogo", "Premier message", new Date()));
		messageRepository.save(new Message(null, "Miraide Augusto", "Deuxieme message", new Date()));
		messageRepository.save(new Message(null, "Habiba Terrim Ogueye", "Troisieme message", new Date()));
		
		messageRepository.findAll().forEach(m -> {
			System.out.println(m.getUsername());
		});
	}

}
