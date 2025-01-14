package com.ranmao.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProjectDemoApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebProjectDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebProjectDemoApplication.class, args);
    }

}
