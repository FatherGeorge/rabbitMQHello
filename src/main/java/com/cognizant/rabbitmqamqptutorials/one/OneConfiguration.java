package com.cognizant.rabbitmqamqptutorials.one;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("one")
class OneConfiguration {

    @Bean
    Queue createQueue(@Value("${tutorial.queue:hello}") final String queueName) {
        return new Queue(queueName);
    }
}
