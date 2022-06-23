package com.ddlab.rnd.config;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.ddlab.rnd.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}