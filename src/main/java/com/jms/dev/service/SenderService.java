package com.jms.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jms.dev.bean.Person;
import com.jms.dev.sender.JmsMessageSender;

@Service
public class SenderService {
	@Autowired(required = true)
	private JmsMessageSender messageSender;

	public void send(Person person) {
		messageSender.send(person);
	}
}
