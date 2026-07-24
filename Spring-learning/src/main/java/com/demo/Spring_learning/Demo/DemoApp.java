//package com.demo.Spring_learning.Demo;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//@SpringBootApplication
//public class DemoApp {
//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(DemoApp.class);
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        String password = "admin@123";
//
//        String hash = encoder.encode(password);
//
//        System.out.println(hash);
//
//        System.out.println(encoder.matches(password, hash));
//    }
//}
