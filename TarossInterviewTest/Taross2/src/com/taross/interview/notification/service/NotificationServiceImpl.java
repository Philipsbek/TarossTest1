package com.taross.interview.notification.service;

public class NotificationServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		// logic to send notification
		System.out.print("Hi"+recipient+message);
	}
	
}
