package com.example.kstreams;

import org.springframework.boot.SpringApplication;

public class TestKstreamsApplication {

    public static void main(String[] args) {
        SpringApplication.from(KStreamsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
