package com.jms.dev.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.jms.dev.bean.Person;

@Component
public class JmsMessageSender {
	@Autowired
	private JmsTemplate jmsTemplate;

	public void send(final Person person ) {
		this.jmsTemplate.send(new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				ObjectMessage message = session.createObjectMessage();
				message.setObject(person);
				return message;
			}
		});
	}
}
