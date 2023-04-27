package com.expresslogicalop.logical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicalApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(LogicalApplication.class, args);
		Operator bean = app.getBean(Operator.class);
		System.out.println(bean);
	}

}
