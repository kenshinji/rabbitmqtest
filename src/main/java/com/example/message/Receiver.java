package com.example.message;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;


@RabbitListener(queues = "testMQ")
public class Receiver {

    @RabbitHandler
    public void receive(Message msg){

        System.out.println(msg.getBody());
    }
}
