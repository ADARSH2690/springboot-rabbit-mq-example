package com.home.rabbitmq.demo.subscriber;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.home.rabbitmq.demo.config.MessagingConfig;
import com.home.rabbitmq.demo.dto.OrderStatus;

@Component
public class User {

	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue :"+orderStatus);
		
	}
}
