package com.demo.messaging.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.messaging.producer.model.Employee;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String, Employee> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String messsage) {

         Employee employee = new Employee( "01","Sami","Govind");
       
         kafkaTemplate.send("my-topic-new", employee);

        return "Employee Message Send " +employee.getId();
    }

}
