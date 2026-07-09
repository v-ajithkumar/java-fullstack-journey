package com.demo.Spring_learning.Day17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "public endpoint";
    }

    @GetMapping("/profile")
    public String profile(){
        return "private endpoint";
    }
}
