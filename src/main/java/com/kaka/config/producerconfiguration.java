package com.kaka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class producerconfiguration {

    @Bean
    public NewTopic new_topic()
    {
        return TopicBuilder.name("Sushil_topic_1").build();
    }
}
