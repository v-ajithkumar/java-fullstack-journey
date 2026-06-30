package com.demo.Spring_learning.Day10;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanLifeCycle {

//    @PostConstruct
    public void init(){
        System.out.println("bean initialized");
    }

    public void build(){
        System.out.println("bean used ....");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("bean destroyed");
    }
}
