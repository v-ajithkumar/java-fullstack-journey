package com.demo.Spring_learning.Day10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigurationEg {

    @Bean
    public EmployeeService1 employeeService1(){
        return new EmployeeService1();
    }
}
