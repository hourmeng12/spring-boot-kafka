package com.example.springbootkafka.controllers;

import com.example.springbootkafka.dto.MessageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/v1/messages")
public class MessagesController {
    private KafkaTemplate<String, String> kafkaTemplate;

    public MessagesController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public ResponseEntity<MessageRequest> publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("log",request.getMessage());
        return new ResponseEntity<>(request,HttpStatus.CREATED);
    }
}
