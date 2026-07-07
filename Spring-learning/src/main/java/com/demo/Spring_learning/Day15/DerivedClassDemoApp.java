package com.demo.Spring_learning.Day15;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DerivedClassDemoApp {
    public static void main(String[] args) {
        ApplicationContext context;
        context = SpringApplication.run(DerivedClassDemoApp.class ,args);
    }
//    @Bean
//    CommandLineRunner runner(EmployeeRepository repo) {
//        return arg -> {
//            repo.save(new Employee(1, "Ajith", 50000, "IT", 25));
//            repo.save(new Employee(2, "John", 60000, "HR", 30));
//            repo.save(new Employee(3, "David", 40000, "IT", 22));
//            repo.save(new Employee(4, "Arun", 70000, "Finance", 28));
//        };
//    }

  /*  @Bean
    CommandLineRunner runner(EmployeeRepository empRepo){
        return args -> {
        //findBy
            Employee emp = empRepo.findByName("Ajith");
            System.out.println(emp.getName());
        };
    } */

    @Bean
    CommandLineRunner runner(EmployeeRepository empRepo){
        return args -> {
        //And
//            List<Employee> list = empRepo.findByNameAndDepartment("Ajith","IT");
//            list.forEach(System.out::println);
        //Or
//            List<Employee> list = empRepo.findByDepartmentOrAge("IT",25);
//            list.forEach(System.out::println);
        //Between
            List<Employee> list =
                    empRepo.findBySalaryBetween(45000,65000);
            list.forEach(System.out::println);
        };
    }



}
