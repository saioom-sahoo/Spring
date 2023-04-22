package com.expressionlanguageop.operator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OperatorApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(OperatorApplication.class, args);
		OperatorDemo op = app.getBean(OperatorDemo.class);
		System.out.println(op);

		// System.out.println(op.getAdd());
	}

}
