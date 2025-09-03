package com.messaging.app.data_streaming_gateway.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    public NewTopic transactionTopic(){
        return TopicBuilder.name("transaction-topic")
        .partitions(2)
        .replicas(2)
        .build();
    }
}
