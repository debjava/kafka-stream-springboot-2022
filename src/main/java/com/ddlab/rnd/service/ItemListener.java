package com.ddlab.rnd.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.model.Item;
import com.ddlab.rnd.stream.ItemStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemListener {
	
	@StreamListener(ItemStreams.INPUT)
    public void handleGreetings(@Payload Item Item) {
        log.info("Received Item: {}", Item);
    }
}
