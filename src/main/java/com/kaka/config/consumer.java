package com.kaka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class consumer {
//single configuration is required for the consumer
    @KafkaListener(topics = "Sushil_topic_1",groupId = "group-1")
    public void systout(String value)
    {
        System.out.println(value+"---");
    }

}
