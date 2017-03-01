package com.example.message;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * <p>Title: Receiver</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: HP Development Company L.P.</p>
 *
 * @author wangzen
 * @date 2/28/2017
 */
@RabbitListener(queues = "testMQ")
public class Receiver {

    @RabbitHandler
    public void receive(Message msg){

        System.out.println(msg.getBody());
    }
}
