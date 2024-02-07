package com.taross.interview.notification.consumer;

import com.taross.interview.notification.service.MessageService;
import com.taross.interview.notification.service.NotificationServiceImpl;

public class NotificationProcessor implements ServiceProcessor {

	private MessageService service;

	public NotificationProcessor(MessageService service) {
		this.service = service;
	}

	public NotificationProcessor() {}

	public void setService(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMessages(String message, String recipient) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(message, recipient);
	}

	public void setService(NotificationServiceImpl service2) {
		// TODO Auto-generated method stub
		
	}

}
