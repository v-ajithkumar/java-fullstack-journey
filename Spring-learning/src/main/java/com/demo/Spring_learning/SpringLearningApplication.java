package com.demo.Spring_learning;

import com.demo.Spring_learning.Day10.ValueEg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(SpringLearningApplication.class, args);

		ValueEg v1 = context.getBean(ValueEg.class);
		v1.display();
	}

}
