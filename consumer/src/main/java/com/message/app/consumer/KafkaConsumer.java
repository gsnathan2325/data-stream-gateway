package com.message.app.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.message.app.consumer.model.Employee;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void listen(String message) {

        System.out.println("Received Message..." + message);

    }

    @KafkaListener(topics = "my-topic-new", groupId = "my-group")
    public void listen2(Employee employee) {

        System.out.println("Received Message from Data Consumer " + employee.getId());

    }

}
