package com.example.springapikafka.queue.consumer.impl;

import com.example.springapikafka.queue.consumer.AccountTransferListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AccountTransferListenerImpl implements AccountTransferListener {

    @Override
    @KafkaListener(
            id = "accountTransferListener",
            containerFactory = "accountTransferListenerFactory",
            topics = "${kafka.account-transfer.topic}",
            groupId = "${kafka.account-transfer.group-id}"
    )
    public void consume(String message) {
        log.info("Teste");
    }
}
