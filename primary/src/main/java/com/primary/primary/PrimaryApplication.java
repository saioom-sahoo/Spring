package com.primary.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaryApplication {

	public static void main(String[] args) {
		var app = SpringApplication.run(PrimaryApplication.class, args);

		Student student = app.getBean(Student.class);
		System.out.println(student.getName() + " " + student.getRoll());

	}

}
