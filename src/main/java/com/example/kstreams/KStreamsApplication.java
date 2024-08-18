package com.example.kstreams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class KStreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KStreamsApplication.class, args);
    }

}
