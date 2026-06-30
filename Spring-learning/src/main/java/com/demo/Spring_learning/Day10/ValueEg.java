package com.demo.Spring_learning.Day10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueEg {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private double appVersion;

    public void display(){
        System.out.println(appName);
        System.out.println(appVersion);
    }
}
