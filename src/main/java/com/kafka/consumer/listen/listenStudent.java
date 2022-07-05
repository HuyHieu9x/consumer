package com.kafka.consumer.listen;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class listenStudent {

    @KafkaListener(topics = "topic-hieu", groupId = "group_id")
    public void listenStd(String message) {
        System.out.println("Received Message : " + message);
    }
}
