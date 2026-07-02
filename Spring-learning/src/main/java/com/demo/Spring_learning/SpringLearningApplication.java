package com.demo.Spring_learning;

import com.demo.Spring_learning.Day11.ConfigurationPropertyEg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(SpringLearningApplication.class, args);

	}

}
