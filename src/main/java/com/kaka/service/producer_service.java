package com.kaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class producer_service {
@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

public void updatelocation(String value){
    this.kafkaTemplate.send("Sushil_topic_1",value);
//    System.out.println(true);
}
}
