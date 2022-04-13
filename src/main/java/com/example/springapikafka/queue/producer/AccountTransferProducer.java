package com.example.springapikafka.queue.producer;

public interface AccountTransferProducer {

    void sendMessage(String value);
}
