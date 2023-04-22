package com.operatorlogicalorrelation.logicalorrelational;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicalorrelationalApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(LogicalorrelationalApplication.class, args);
		var op = app.getBean(LogicalOrRelational.class);
		System.out.println(op);
	}

}
