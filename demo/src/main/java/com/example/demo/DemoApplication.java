package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(DemoApplication.class, args);
		Student bean = app.getBean(Student.class);
		bean.setName("sai");
		System.out.println(bean.getName());

	}

}
