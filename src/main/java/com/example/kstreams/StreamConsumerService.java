package com.example.kstreams;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("streamService")
@Slf4j
public class StreamConsumerService implements Function<KStream<String, String>, KStream<String, String>> {

    @Override
    public KStream<String, String> apply(KStream<String, String> stringStringKStream) {
        return stringStringKStream
                .peek((key, value) -> log.info("key: {} old value: {}", key, value))
                .map((key, value) -> new KeyValue<>(key, String.format("Hi %s", value)))
                .peek((key, value) -> log.info("key: {} new value: {}", key, value));
    }
}
