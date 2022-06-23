package com.ddlab.rnd.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ItemStreams {

	String INPUT = "item-in";
	String OUTPUT = "item-out";

	@Input(INPUT)
	SubscribableChannel inbound();

	@Output(OUTPUT)
	MessageChannel outbound();
}
