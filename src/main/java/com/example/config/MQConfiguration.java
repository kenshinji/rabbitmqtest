package com.example.config;

import com.example.message.Receiver;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p>Title: MQConfiguration</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: HP Development Company L.P.</p>
 *
 * @author wangzen
 * @date 2/28/2017
 */
@Configuration
public class MQConfiguration {
    @Bean
    public Receiver receiver() {
        return new Receiver();
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
