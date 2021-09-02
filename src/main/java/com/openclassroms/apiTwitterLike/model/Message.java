package com.openclassroms.apiTwitterLike.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "messages")
public class Message {
  
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "author")
	private String username;
	
	@Column(length = 200)
	private String message;
	
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date publictionDate;
	
}
