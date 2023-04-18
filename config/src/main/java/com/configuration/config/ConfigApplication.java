package com.configuration.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(ConfigApplication.class, args);

		Student student = app.getBean(Student.class);

		// System.out.println(student.getName() + " " + student.getRoll());

		student.study();
	}

}
