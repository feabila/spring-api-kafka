package com.example.springapikafka.queue.consumer;

public interface AccountTransferListener {
    void consume(String message);
}
