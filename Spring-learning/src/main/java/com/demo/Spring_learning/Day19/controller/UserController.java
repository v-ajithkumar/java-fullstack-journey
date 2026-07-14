package com.demo.Spring_learning.Day19.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUser")
    @RolesAllowed("Admin")
    public String getUsers(){
        return "Users fetched after jwt validation";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(){
        System.out.println("User deleted only by Admin");
    }

    @Secured("ROLE_ADMIN")
    public void addUser(){
        System.out.println("only admin can add");
    }
}
