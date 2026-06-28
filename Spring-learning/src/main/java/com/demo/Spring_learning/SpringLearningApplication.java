package com.demo.Spring_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(SpringLearningApplication.class, args);
		//Ioc
//		Dev d1 = context.getBean(Dev.class);
//		d1.build();

		//DI :
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.showEmployee();

	}

}
