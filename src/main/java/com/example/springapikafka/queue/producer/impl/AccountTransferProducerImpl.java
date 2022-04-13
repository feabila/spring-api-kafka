package com.example.springapikafka.queue.producer.impl;

import com.example.springapikafka.queue.producer.AccountTransferProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AccountTransferProducerImpl implements AccountTransferProducer {

    @Autowired
    private KafkaTemplate<String, String> accountTransferTemplate;

    @Value("${kafka.account-transfer.topic}")
    private String accountTransferTopic;

    @Override
    public void sendMessage(String value) {
        accountTransferTemplate.send(accountTransferTopic, value);
    }

    @PostConstruct
    public void setUp() {
        accountTransferTemplate.send(accountTransferTopic, "Exemplo");
    }
}
