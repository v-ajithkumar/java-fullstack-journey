package com.demo.Spring_learning.Day9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev1 {

//   @Autowired //field injection
//   @Qualifier("desktop")

   final private Computer comp;

   //constructor injection
   public Dev1(Computer comp){
       this.comp =comp;
   }

    //setter injection
//    @Autowired
//    public void SetLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Working on a project..........");
    }
}
