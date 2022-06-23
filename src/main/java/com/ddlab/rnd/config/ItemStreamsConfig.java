package com.ddlab.rnd.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.ddlab.rnd.stream.ItemStreams;

@EnableBinding(ItemStreams.class)
public class ItemStreamsConfig {

}
