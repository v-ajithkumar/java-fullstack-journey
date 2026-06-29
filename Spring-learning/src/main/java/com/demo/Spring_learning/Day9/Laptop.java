package com.demo.Spring_learning.Day9;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiled from laptop");
    }
}
