package com.message.app.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaDataConsumer {

    @KafkaListener(topics  = "my-topic-new" , groupId = "my-group")
    public void listem(String message){

    System.out.println("Received Message from Data Consumer "+message);

    }

}
