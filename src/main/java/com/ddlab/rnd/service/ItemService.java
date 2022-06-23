package com.ddlab.rnd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.ddlab.rnd.model.Item;
import com.ddlab.rnd.stream.ItemStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemService {

	@Autowired
	private ItemStreams itemStreams;

	public void sendMessage(final Item item) {
		log.info("Sending item {}", item);

		MessageChannel messageChannel = itemStreams.outbound();
		Message<Item> message = MessageBuilder.withPayload(item)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
				.build();
		messageChannel.send(message);
	}
}
