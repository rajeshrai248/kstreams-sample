package com.example.kstreams;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/test/{name}")
    public void test(@PathVariable String name) {
        kafkaTemplate.send("input-topic", UUID.randomUUID().toString(), name);
    }

}
