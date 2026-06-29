package com.demo.Spring_learning.Day9;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("compiling from desktop");
    }
}
