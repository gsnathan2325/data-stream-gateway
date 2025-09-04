package com.message.app.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics  = "my-topic" , groupId = "my-group")
    public void listem(String message){

    System.out.println("Received Message..."+message);

    }

}
