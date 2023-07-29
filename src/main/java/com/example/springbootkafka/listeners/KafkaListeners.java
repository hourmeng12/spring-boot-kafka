package com.example.springbootkafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "log", groupId = "default")
    void listener(String data){
        System.out.println("Listener received: " + data + " 🪅");
    }
}
