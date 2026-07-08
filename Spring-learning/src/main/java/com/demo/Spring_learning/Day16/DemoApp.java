package com.demo.Spring_learning.Day16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApp.class, args);
    }
}
